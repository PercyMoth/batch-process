package batch;

import java.util.Properties;

public class Record {
    private Properties fields;

    public Record() {

    }

    public Record(Properties fields) {
        this.fields = fields;
    }

    public void setFields(Properties fields) {
        this.fields = fields;
    }

    public Properties getFields() {
        return fields;
    }

}
