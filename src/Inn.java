import java.util.Scanner;

public class Inn {
   public static void main(String[] args)
   {
      RoomRegister roomRegister = new RoomRegister();
      RecordRegister recordRegister = new RecordRegister();
      
      //testing customers
      Customer[] customers = new Customer[3];
      customers[0] = new Customer(0, "Anders", "Andersen", 55555555, "mail@gmail.com", "adressevej 10", 2880);
      customers[1] = new Customer(1, "Jens", "Jensen", 44444444, "email@gmail.com", "vejnavn 19", 2690);
      customers[2] = new Customer(2, "Peter", "Petersen", 77777777, "email@hotmail.com", "addresse 2", 2540);
      
      //testing rooms
      roomRegister.addRoom(new Room(1, 2, 19.2, true, 289.0));
      roomRegister.addRoom(new Room(2, 3, 25.4, true, 359.0));
      roomRegister.addRoom(new Room(3, 1, 11.9, true, 189.0));
      
      //scanner to read input
      Scanner scanner = new Scanner(System.in);
      
      //bool to check if program should continue running
      boolean runProgram = true;
      
      System.out.println("*** Inn system loaded ***");
      
      while (runProgram)
      {
         //read subsystem input choice
         System.out.print("Keys:\n0 - Exit the program\n1 - Manage working hours\n2 - Manage the reception\nInput>");
         int subSystemChoice = scanner.nextInt();
         
         if (subSystemChoice == 0)
         {
            //end program at next while check
            runProgram = false;
         }
         else if (subSystemChoice == 1)
         {
            //TODO: implement working hours system
         }
         else if (subSystemChoice == 2)
         {
            boolean receptionChosen = true;
            
            while (receptionChosen) //makes the menu stay inside the reception loop
            {
               System.out.print("*** Reception ***\nKeys:\n0 - Exit the reception sub system\n1 - List all rooms\n2 - List all available rooms\n3 - List all records\n4 - Rent out a room\n5 - Check-out of room\nInput>");
               int receptionChoice = scanner.nextInt();
            
               if (receptionChoice == 0) //close and exit the program
               {
                  receptionChosen = false;
               }
               else if (receptionChoice == 1) //list all rooms
               {
                  if (roomRegister.listRooms().size() > 0)
                  {
                     for (Room room : roomRegister.listRooms())
                     {
                        System.out.println(room.toString());
                     }
                  }
                  else
                  {
                     System.out.println("No rooms to list.");
                  }               
               }
               else if (receptionChoice == 2) //list only rooms that are available
               {
                  if (roomRegister.listAvailableRooms().size() > 0)
                  {
                     for (Room room : roomRegister.listAvailableRooms())
                     {
                        System.out.println(room.toString());
                     }
                  }
                  else
                  {
                     System.out.println("No available rooms to list.");
                  }               
               }
               else if (receptionChoice == 3) //list all records
               {
                  if (recordRegister.listRecords().size() > 0)
                  {
                     for (Record record : recordRegister.listRecords())
                     {
                        System.out.println(record.toString());
                     }
                  }
                  else
                  {
                     System.out.println("No records to list.");
                  }
               }
               else if (receptionChoice == 4) //rent out a room
               {
                  System.out.print("Room nr.>");
                  int roomNumber = scanner.nextInt();
                  System.out.print("Customer ID>");
                  int customerId = scanner.nextInt();
                  System.out.print("How many days will the room be rented out?>");
                  int daysToRent = scanner.nextInt();
               
                  roomRegister.rentOutRoom(roomNumber, customerId, daysToRent, recordRegister);
               }
               else if (receptionChoice == 5) //checkout customer from room number
               {
                  System.out.print("Room nr.>");
                  int roomNumber = scanner.nextInt();
                  roomRegister.checkOut(roomNumber);
               }
               else
               {
                  System.out.println("Please select either 0, 1, 2, 3, 4 or 5 to continue...");
               }
            }            
         }
         else
         {
            System.out.println("Please select either 0, 1 or 2 to continue...");
         }
      }
   }
}