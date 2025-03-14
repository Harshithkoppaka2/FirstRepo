package PasswordCheck;

public class ValidationLogger  implements AutoCloseable{
	
    private static boolean hasLoggedCompletion = false;

    public void Log(String Status,String Message) {
    	
    	System.out.printf("Status : %s  | Message : %s%n ",Status,Message);
    }
    
    public void LogSuccess() {
    	
    	Log("Success","The password meets all the security");
    }
    
    public void LogFail(String reason) {
    	Log("Failure", reason);
    }

	@Override
    public void close() {  // ✅ FIXED: No `throws Exception` here
        if (!hasLoggedCompletion) {
            Log("INFO", "Password validation process completed.");
            hasLoggedCompletion = true;
        }
    }

}
