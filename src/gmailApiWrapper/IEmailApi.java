package gmailApiWrapper;

import java.io.IOException;
import java.util.List;

public interface IEmailApi {

    List<IEmailMessage> getMessages(String userId) throws IOException;

    byte[] getAttachmentBytes(Attachment attachment, String userId, IEmailMessage message);
}