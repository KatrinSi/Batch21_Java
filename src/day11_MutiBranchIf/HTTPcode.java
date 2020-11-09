package day11_MutiBranchIf;

public class HTTPcode {
    public static void main(String[] args) {
        int statusCode = 500;
        String output = " ";

        if (statusCode == 200) {
            output = "OK";
        }else if (statusCode == 201) {
            output = "Created";
        }else if (statusCode == 202) {
            output = "Accepted";
        }else if (statusCode == 301) {
            output = "Moved Permanently";
        }else if (statusCode == 303) {
            output = "See other";
        }else if (statusCode == 304) {
            output = "Not Modified";
        }else if (statusCode == 307) {
            output = "Temporary Redirect";
        }else if (statusCode == 400) {
            output = "Bad Request";
        }else if (statusCode == 401) {
            output = "Unauthorized";
        }else if (statusCode == 403) {
            output = "Forbidden";
        }else if (statusCode == 404) {
            output = "Not Found";
        }else if (statusCode == 410) {
            output = "Not Found";
        }else if (statusCode == 500) {
            output = "Internal Server Error";
        }else {
            output = "Service Unavailable";
        }
        System.out.println(output);
    }
}

