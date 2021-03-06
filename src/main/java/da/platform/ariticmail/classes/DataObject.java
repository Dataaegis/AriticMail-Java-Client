/*
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package da.platform.ariticmail.classes;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author mgamble
 */
public class DataObject {
    private ErrorCode code;
    private String message;
    private String token;
    private String message_id;
    private HashMap<String, SendResult> messages;
    
    
    public DataObject() {
        this.messages = new HashMap<>();
    }
    /**
     * @return the code
     */
    public ErrorCode getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(ErrorCode code) {
        this.code = code;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return the message_id
     */
    public String getMessage_id() {
        return message_id;
    }

    /**
     * @param message_id the message_id to set
     */
    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }

    /**
     * @return the messages
     */
    public HashMap<String, SendResult> getMessages() {
        return messages;
    }

    /**
     * @param messages the messages to set
     */
    public void setMessages(HashMap<String, SendResult> messages) {
        this.messages = messages;
    }
}
