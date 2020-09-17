package tr.com.sakarya.uni.tez.mvc.web.testserializer;

import java.io.IOException;

import org.apache.avro.generic.GenericRecord;

public interface ISpecificAvroSerializer<T> {

	void append(T record) throws IOException;

	void flush() throws IOException;
}
