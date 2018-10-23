import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class RecordRegister {

	private List<Record> recordsList;

	public RecordRegister()
   {
		recordsList = new ArrayList<>();
	}
   
   //get a list of all records
	public List<Record> listRecords() {
		return recordsList;
	}
   
   //saves record to the list collection
	public void addRecord(Record record) {
		recordsList.add(record);
	}
   
   //remove record at specific index
   public void removeRecord(int index) {
      recordsList.remove(index);
   }
}