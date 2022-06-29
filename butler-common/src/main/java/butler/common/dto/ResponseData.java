package butler.common.dto;

public class ResponseData<T> {

    private int code;
    private String message;
    private T Data;

    public ResponseData(int code, String message, T data) {
        this.code = code;
        this.message = message;
        Data = data;
    }

    public static <T> ResponseData<T> ok(T data) {
        return new ResponseData<>(200, "ok", data);
    }

    public static ResponseData<String> error(int code, String message) {
        return new ResponseData<>(code, message, "");
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", Data=" + Data +
                '}';
    }
}
