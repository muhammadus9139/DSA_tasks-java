

// SP25-BCS-151
import java.util.Random;

public class Playlist {

    Song head=null;
    Song current=null;

    void addsong(int id,String title,String artist,int duration){
        Song newsong=new Song(id,title,artist,duration);

        if(head==null){
            head=newsong;
            newsong.next=head;
            current=head;
        }
        else{
            Song temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newsong;
            newsong.next=head;
        }
    }

    void removesong(int id){
        if(head==null){
            System.out.println("Playlist is empty");
            return;
        }

        if(head.id==id){
            head=null;
            return;
        }

        if(head.id==id){
            Song last=head;
            while(last.next!=head){
                last=last.next;
            }
            head=head.next;
            last.next=head;
            return;
        }

        Song temp=head;
        Song prev=null;

        do{
            prev=temp;
            temp=temp.next;

            if(temp.id==id){
                prev.next=temp.next;
                return;
            }
        }while(temp!=head);

        System.out.println("Song not found!");
    }

    public void display(){
        if(head==null){
            System.out.println("Playlist empty");
            return;
        }
        Song temp=head;
        do{
            System.out.println(temp.id+"-"+temp.title+" "+temp.Artist+" "+"Duration:"+temp.duration+"");
            temp=temp.next;
        }while(temp!=head);
    }

    void play(int count){
        if(head==null){
            System.out.println("Playlist empty");
            return;
        }
        Song temp=current;
        for(int i=0;i<count;i++){
            System.out.println("Playing: "+temp.title);
            temp=temp.next;
        }
        current=temp;
    }

    void nextsong(){
        if(current!=null){
            current=current.next;
            System.out.println("Now playing "+current.title);
        }
    }

    void previoussong(){
        if(current==null){
            return;
        }

        Song temp=head;
        while(temp.next!=current){
            temp=temp.next;
        }
        current=temp;
        System.out.println("Now playing: "+current.title);
    }

    public void shuffle(){
        if(current==null){
            return;
        }
        Random rand=new Random();
        int steps=rand.nextInt(5)+1;

        for(int i=0;i<steps;i++){
            current=current.next;
        }
        System.out.println("Shuffle: "+current.title);
    }
}
