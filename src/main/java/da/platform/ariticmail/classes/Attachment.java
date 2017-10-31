
package da.platform.ariticmail.classes;

/**
 *
 * @author Narasimha
 */
/*
The MIT License (MIT)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */

public class Attachment {
    private String name;
    private String content_type;
    private String data;

    
    public Attachment(String name, String content_type, String data) {
        this.name = name;
        this.content_type = content_type;
        this.data = data;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the content_type
     */
    public String getContent_type() {
        return content_type;
    }

    /**
     * @param content_type the content_type to set
     */
    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
}
