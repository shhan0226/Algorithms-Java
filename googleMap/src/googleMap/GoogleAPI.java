package googleMap;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLEncoder;

import javax.swing.ImageIcon;

public class GoogleAPI {

	public void downloadMap(String location) {// 이미지 파일 다운로드
		try {
			String imageURL = "https://www.google.com/maps/api/staticmap?center=" + URLEncoder.encode(location, "UTF-8")
					+ "&zoom=11&size=612x612&scale=2";
			URL url = new URL(imageURL);
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream(location);
			byte[] b = new byte[2048];
			int length;
			while ((length = is.read(b)) != -1) { // 파일 읽어 오기 쓸수 없을때 까지
				os.write(b, 0, length);
			}
			is.close();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ImageIcon getMap(String location) {// 지도 얻어오기
		return new ImageIcon(
				(new ImageIcon(location)).getImage().getScaledInstance(612, 612, java.awt.Image.SCALE_SMOOTH));
	}

	public void fileDelete(String fileName) {
		File f = new File(fileName);
		f.delete();
	}

}
