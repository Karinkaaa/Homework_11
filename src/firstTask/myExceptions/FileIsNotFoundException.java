package firstTask.myExceptions;

import java.io.IOException;

public class FileIsNotFoundException extends IOException {

    public FileIsNotFoundException(String message) {
        super(message);
    }
}
