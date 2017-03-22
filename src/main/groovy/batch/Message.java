package batch;

import java.util.Properties;

public class Message {
    private Properties fields;
    private int fieldCount = 0;

    public Message() {

    }

    public void setField(String field) {
        this.fields.setProperty(Integer.toString(fieldCount++), field);
    }

    public Properties getFields() {
        return fields;
    }

}
