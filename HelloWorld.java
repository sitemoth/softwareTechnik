package java.time;

class HelloWorld
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World." );
        System.out.println( "haha jk" );

        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        // String inputString1 = "01 04 2020";
        // String inputString2 = "05 11 2020";
        
        LocalDateTime tStart;
        LocalDateTime tNow;

        tStart = LocalDateTime.parse( "2020-04-01T00:00:00" );
        tNow = LocalDateTime.now();

        long minutesBetween = Duration.between( tStart, tNow ).toMinutes();

        System.out.println( "MINUTES SINCE STUDY START " + minutesBetween );
        System.out.println("Elite Programmierer");
    }
}
