import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class RoomRegister {

	private List<Room> roomList;
   
	public RoomRegister()
   {
		roomList = new ArrayList<>();
	}
   
   //get all rooms
   public List<Room> listRooms() {
		return roomList;
	}
   
   //get all rooms available for rent
   public List<Room> listAvailableRooms() {
      List<Room> tempList = new ArrayList<>();
      for (Room room : roomList)
      {
         if (room.isAvailable())
         {
            tempList.add(room);
         }
      }
      return tempList;
   }
   
   //add room to the list collection
   public void addRoom(Room room) {
      roomList.add(room);
   }
   
   public void removeRoom(int roomNumber) {
      int index = -1;
      //check each room individually to match the room number
      for (int i = 0; i < roomList.size(); i++)
      {
         if (roomList.get(i).getRoomNumber() == roomNumber)
         {
            index = i; //saves the index in the list to remove after
         }
      }
      
      if (index != -1) //if index is -1 no rooms could be found
      {
         roomList.remove(index);
         System.out.println("Room nr.: " + roomNumber + " has been removed.");
      }
      else
      {
         System.out.println("Room nr.: " + roomNumber + " could not be located.");
      }
   }

   //rent a room to a specific customer
	public void rentOutRoom(int roomNumber, int customerId, int daysToRent, RecordRegister recordRegister) {
      for (int i = 0; i < roomList.size(); i++)
      {
         if (roomList.get(i).getRoomNumber() == roomNumber)
         {
            if (roomList.get(i).isAvailable())
            {
               //make room unavailable
               roomList.get(i).setIsAvailable(false);
               
               //set appropiate checkin/checkout dates to record
               LocalDateTime checkInDate = LocalDateTime.now();
               LocalDateTime checkOutDate = LocalDate.now().atTime(11, 0).plusDays(daysToRent);
               
               //save to the record register
               Record record = new Record(checkInDate, checkOutDate, roomNumber, customerId);
               recordRegister.addRecord(record);
               
               //print info
               System.out.println("Room succesfully rented out. Record information:\n" + record.toString());
               System.out.println("Price to pay for the stay is " + roomList.get(i).getPricePerNight() * daysToRent);
            }
            else
            {
               System.out.println("Room could not be rented out because it is not available.");
            }
         }
      }
	}
   
   //checkout a customer to make a room available
   public void checkOut(int roomNumber) {
      for (int i = 0; i < roomList.size(); i++)
      {
         if (roomList.get(i).getRoomNumber() == roomNumber)
         {
            roomList.get(i).setIsAvailable(true);
            System.out.println("Room nr.: " + roomNumber + " checked out and made available.");
         }
      }
   }
}