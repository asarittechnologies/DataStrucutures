/*
package existingclasses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ResponseHeaderOverrides;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.transfer.MultipleFileDownload;
import com.amazonaws.services.s3.transfer.TransferManager;
import org.apache.commons.io.FilenameUtils;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class GetObject2 {

    private static final String S3_PATH_FORMAT = "%s/%s/";
    private static final String DIR_TO_ZIP_PATTERN = "%smessagesToLocalize/%s";
    private static final String ZIP_FILE_NAME_PATTERN = "%s%s.zip";
    private static final String BACK_SLASH = "/";
    private static final int BUFFER_SIZE = 4096;
    private static final String s3Folder = "messageToLocalize";
    public static void main(String[] args) throws IOException, InterruptedException {
        TransferManager transferManager = new TransferManager();
        String downloadDir = "C:\\expedia\\renu\\";
        final File destinationDirectory = new File("C:\\expedia\\renu\\");
        MultipleFileDownload multipleFileDownload = transferManager
                .downloadDirectory("localization-demo",
                        String.format(S3_PATH_FORMAT, s3Folder, "b8faa2eb-c520-4928-b5ea-8e0410a7f4a8"),
                        destinationDirectory);
        multipleFileDownload.waitForCompletion();
        if (multipleFileDownload.isDone()) {
            String downloadZipFileName = "b8faa2eb-c520-4928-b5ea-8e0410a7f4a8";
            String zipFileName = String.format(ZIP_FILE_NAME_PATTERN, downloadDir, downloadZipFileName);
            FileOutputStream fos = new FileOutputStream(FilenameUtils.normalize(zipFileName));
            ZipOutputStream zipOut = new ZipOutputStream(fos);

            final File dirToZip =
                    new File(FilenameUtils.normalize(
                            String.format(DIR_TO_ZIP_PATTERN, downloadDir,
                                    "b8faa2eb-c520-4928-b5ea-8e0410a7f4a8"))
                    );
            zip(dirToZip, downloadZipFileName, zipOut);
            zipOut.close();
            fos.close();
        }
    }


        public static void zip(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {
            if (fileToZip.isHidden()) {
                return;
            }

            if (fileToZip.isDirectory()) {
                if (fileName.endsWith(BACK_SLASH)) {
                    zipOut.putNextEntry(new ZipEntry(FilenameUtils.normalize(fileName)));
                    zipOut.closeEntry();
                } else {
                    zipOut.putNextEntry(new ZipEntry(FilenameUtils.normalize(fileName + BACK_SLASH)));
                    zipOut.closeEntry();
                }
                File[] children = fileToZip.listFiles();
                for (File childFile : children) {
                    zip(childFile, FilenameUtils.normalize(fileName + BACK_SLASH + childFile.getName()), zipOut);
                }
                return;
            }
            FileInputStream fis = new FileInputStream(fileToZip);
            ZipEntry zipEntry = new ZipEntry(FilenameUtils.normalize(fileName));
            zipOut.putNextEntry(zipEntry);
            byte[] bytes = new byte[BUFFER_SIZE];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
            fis.close();
        }

}

*/
