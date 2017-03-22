package batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import java.util.Properties;

public class RecordMapper implements FieldSetMapper<Record> {
	public Record mapFieldSet(FieldSet fs) {

		if (fs == null) {
			return null;
		}

		Record record = new Record ();

		String [] fields = fs.getValues ();
		for (int i = 0; i <= fields.length - 1; i++) {
			String numberAsString = Integer.toString(i);
			String key = "B"
				   + "000".substring(numberAsString.length())
				   + numberAsString;
			String value = fields[i];
			record.getFields().setProperty(key, value);
		}
		
		return record;
	}

}
