

// SP25-BCS-151
public class Song {
    int id;
    String title;
    String Artist;
    int duration;
    Song next;

    Song(int id,String title,String Artist,int duration){
        this.id=id;
        this.title=title;
        this.Artist=Artist;
        this.duration=duration;
        this.next=null;
    }

    public String toString(){
        return "ID: "+id+"Title: "+title+"Artist: "+Artist+"Duration: "+duration;
    }

}
