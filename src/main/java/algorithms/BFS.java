package algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BFS {
    public static void main(String[] args) {
        BFS bfs = new BFS();
        bfs.discoverWeb("https://www.youtube.com");
    }
    private Queue<String> queue;
    private List<String> discoveredWebList;
    public BFS(){
        this.queue = new LinkedList<>();
        this.discoveredWebList = new ArrayList<>();
    }
    public void discoverWeb(String root){
        queue.add(root);
        discoveredWebList.add(root);

        while(!queue.isEmpty()){
            String v = queue.remove();
            String readHTML = readHTML(root);
            String regExp = "https://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regExp);
            Matcher matcher = pattern.matcher(readHTML);
            while (matcher.find()){
                String w = matcher.group();

                if(!discoveredWebList.contains(w)){
                    discoveredWebList.add(w);
                    System.out.println("Found website "+w);

                }
            }

        }
    }
    public String readHTML(String root)  {
        StringBuilder sb = new StringBuilder("");
        try{
            URL url = new URL(root);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            while((line = bufferedReader.readLine()) != null){
                sb.append(line);
            }
            bufferedReader.close();
        }catch (Exception e){
            System.out.println("Problem while parsing the website "+e.getMessage());
        }
        return sb.toString();
    }
}
