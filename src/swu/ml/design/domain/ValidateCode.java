package swu.ml.design.domain;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

public class ValidateCode {
    private int width = 120;  	// ����ͼƬ��width
    private int height = 30;	// ����ͼƬ��height
    private int codeCount = 5;	// ����ͼƬ����ʾ��֤��ĸ���
    private int fontHeight = 22;
    private BufferedImage codeImage = null;
    private String codeString = null;
    private char[] codeSequence = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    public ValidateCode() {
        this.createCode();
    }


    private void createCode() {
        Random random = new Random();

        BufferedImage buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics gd = buffImg.getGraphics();
        gd.setColor(Color.WHITE);
        gd.fillRect(0, 0, width, height);

        // ��������
        Font font = new Font("Fixedsys", Font.BOLD, fontHeight);
        gd.setFont(font);

        // ���߿�
        gd.setColor(Color.BLACK);
        gd.drawRect(0, 0, width - 1, height - 1);


        StringBuffer randomCode = new StringBuffer();
        // �������codeCount���ֵ���֤�롣
        for (int i = 0; i < codeCount; i++) {
            // �õ������������֤�����֡�
            String code = String.valueOf(codeSequence[random.nextInt(this.codeSequence.length)]);
            // �������������ɫ����֤����Ƶ�ͼ���С�
            gd.setColor(this.randomColor());
            gd.drawString(code, (i + 1) * (this.width / (this.codeCount + 2)), fontHeight - 2);
            // ���������ĸ�����������һ��
            randomCode.append(code);
        }

        // �������60�������ߣ�ʹͼ���е���֤�벻�ױ���������̽�⵽��
        for (int i = 0; i < 60; i++) {
            int x1 = random.nextInt(width);
            int y1 = random.nextInt(height);
            int x2 = random.nextInt(width / 4);
            int y2 = random.nextInt(width / 4);
            gd.setColor(this.randomColor());
            gd.drawLine(x1, y1, x1 + x2, y1 + y2);
        }

        this.codeString = randomCode.toString();
        this.codeImage = buffImg;
    }

    // �����������ɫ������������ɫֵ�����������ÿλ���ֵ���ɫֵ������ͬ��
    private Color randomColor() {
        Random random = new Random();
        int red = 0, green = 0, blue = 0;
        red = random.nextInt(255);
        green = random.nextInt(255);
        blue = random.nextInt(255);
        return new Color(red, green, blue);
    }



    public void outputCodeImage(OutputStream output) throws IOException {
        ImageIO.write(this.codeImage, "png", output);
    }

    public String getCodeString() {
        return this.codeString;
    }

}
