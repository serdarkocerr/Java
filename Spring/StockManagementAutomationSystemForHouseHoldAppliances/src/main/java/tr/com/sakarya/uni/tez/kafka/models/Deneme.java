/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package tr.com.sakarya.uni.tez.kafka.models;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Deneme extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Deneme\",\"namespace\":\"tr.com.sakarya.uni.tez.kafka.models\",\"fields\":[{\"name\":\"Name\",\"type\":\"string\"},{\"name\":\"Age\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence Name;
  @Deprecated public int Age;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Deneme() {}

  /**
   * All-args constructor.
   */
  public Deneme(java.lang.CharSequence Name, java.lang.Integer Age) {
    this.Name = Name;
    this.Age = Age;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Name;
    case 1: return Age;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Name = (java.lang.CharSequence)value$; break;
    case 1: Age = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'Name' field.
   */
  public java.lang.CharSequence getName() {
    return Name;
  }

  /**
   * Sets the value of the 'Name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.Name = value;
  }

  /**
   * Gets the value of the 'Age' field.
   */
  public java.lang.Integer getAge() {
    return Age;
  }

  /**
   * Sets the value of the 'Age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.Age = value;
  }

  /** Creates a new Deneme RecordBuilder */
  public static tr.com.sakarya.uni.tez.kafka.models.Deneme.Builder newBuilder() {
    return new tr.com.sakarya.uni.tez.kafka.models.Deneme.Builder();
  }
  
  /** Creates a new Deneme RecordBuilder by copying an existing Builder */
  public static tr.com.sakarya.uni.tez.kafka.models.Deneme.Builder newBuilder(tr.com.sakarya.uni.tez.kafka.models.Deneme.Builder other) {
    return new tr.com.sakarya.uni.tez.kafka.models.Deneme.Builder(other);
  }
  
  /** Creates a new Deneme RecordBuilder by copying an existing Deneme instance */
  public static tr.com.sakarya.uni.tez.kafka.models.Deneme.Builder newBuilder(tr.com.sakarya.uni.tez.kafka.models.Deneme other) {
    return new tr.com.sakarya.uni.tez.kafka.models.Deneme.Builder(other);
  }
  
  /**
   * RecordBuilder for Deneme instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Deneme>
    implements org.apache.avro.data.RecordBuilder<Deneme> {

    private java.lang.CharSequence Name;
    private int Age;

    /** Creates a new Builder */
    private Builder() {
      super(tr.com.sakarya.uni.tez.kafka.models.Deneme.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(tr.com.sakarya.uni.tez.kafka.models.Deneme.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Name)) {
        this.Name = data().deepCopy(fields()[0].schema(), other.Name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Age)) {
        this.Age = data().deepCopy(fields()[1].schema(), other.Age);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Deneme instance */
    private Builder(tr.com.sakarya.uni.tez.kafka.models.Deneme other) {
            super(tr.com.sakarya.uni.tez.kafka.models.Deneme.SCHEMA$);
      if (isValidValue(fields()[0], other.Name)) {
        this.Name = data().deepCopy(fields()[0].schema(), other.Name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Age)) {
        this.Age = data().deepCopy(fields()[1].schema(), other.Age);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'Name' field */
    public java.lang.CharSequence getName() {
      return Name;
    }
    
    /** Sets the value of the 'Name' field */
    public tr.com.sakarya.uni.tez.kafka.models.Deneme.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.Name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'Name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'Name' field */
    public tr.com.sakarya.uni.tez.kafka.models.Deneme.Builder clearName() {
      Name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'Age' field */
    public java.lang.Integer getAge() {
      return Age;
    }
    
    /** Sets the value of the 'Age' field */
    public tr.com.sakarya.uni.tez.kafka.models.Deneme.Builder setAge(int value) {
      validate(fields()[1], value);
      this.Age = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'Age' field has been set */
    public boolean hasAge() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'Age' field */
    public tr.com.sakarya.uni.tez.kafka.models.Deneme.Builder clearAge() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Deneme build() {
      try {
        Deneme record = new Deneme();
        record.Name = fieldSetFlags()[0] ? this.Name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.Age = fieldSetFlags()[1] ? this.Age : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
