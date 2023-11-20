/*
package existingclasses;

import org.apache.commons.io.FilenameUtils;
import redis.clients.jedis.JedisPool;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AvoidFileStream {
    private static JedisPool jedisWritePool = new JedisPool();

    public AvoidFileStream(JedisPool jedisWritePool) {
        this.jedisWritePool = jedisWritePool;
    }

    public AvoidFileStream() {

    }

    public static void main(String[] args) throws IOException {
        AvoidFileStream avoidFileStream = new AvoidFileStream();
        //redis();
        //File file = writeToFile();
       */
/* String text = "abc?version";
        String[] splitArray = text.split("");
        System.out.println(splitArray != null);
        System.out.println(text.substring(0,text.indexOf("?")));*//*




    }

    */
/* try (BufferedWriter writer = java.nio.file.Files.newBufferedWriter(Paths.get(file.getPath()), StandardCharsets.UTF_8)) {
        for (String key : keys) {
            writer.write(String.format(String.format(KEYS_STRING_FORMAT, key, System.lineSeparator())));
        }
    }*//*

    public static File writeToFile() throws IOException {
        File file = new File(FilenameUtils.normalize("C:\\expedia\\renu\\renu.txt"));
        List<String> keys = List.of("renu is working on expedia","in bangalore");
        try (BufferedWriter writer = java.nio.file.Files.newBufferedWriter(Paths.get(file.getPath()), StandardCharsets.UTF_8)) {
            for (String key : keys) {
                writer.write(key);
            }
        }
        return file;
    }
    public static void redis(){
        Set<String> matchingKeys = new HashSet<>();
        matchingKeys.add("renu");
        String[] strings = matchingKeys.toArray(new String[0]);
        Arrays.stream(strings).forEach(System.out::println);

    }
    public void writeToFile(String fileName, byte[] content) throws IOException {
        try (FileOutputStream os = new FileOutputStream(fileName)) {
            os.write(content);
        }
    }
    public void writeToFile1(String fileName, byte[] content) throws IOException {
        try (OutputStream os = Files.newOutputStream(Paths.get(fileName))) {
            os.write(content);
        }
    }
    public byte[] readFromFile1(String fileName) throws IOException {
        byte[] buf = new byte[8192];
        try (InputStream is = Files.newInputStream(Paths.get(fileName))) {
            int len = is.read(buf);
            if (len < buf.length) {
                return Arrays.copyOf(buf, len);
            }
            ByteArrayOutputStream os = new ByteArrayOutputStream(16384);
            while (len != -1) {
                os.write(buf, 0, len);
                len = is.read(buf);
            }
            return os.toByteArray();
        }
    }
    public byte[] readFromFile(String fileName) throws IOException {
        byte[] buf = new byte[8192];
        try (FileInputStream is = new FileInputStream(fileName)) {
            int len = is.read(buf);
            if (len < buf.length) {
                return Arrays.copyOf(buf, len);
            }
            ByteArrayOutputStream os = new ByteArrayOutputStream(16384);
            while (len != -1) {
                os.write(buf, 0, len);
                len = is.read(buf);
            }
            return os.toByteArray();
        }
    }

}


*/
