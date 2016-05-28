package interfaceGrafica.gatoDeArnold;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ImagemPGM implements Cloneable{

        int[][] pixels;

        int maxValue;

        int largura;

        int altura;

        public ImagemPGM(File arquivo) throws IOException {

                BufferedReader imgArq = new BufferedReader(
                                new FileReader(arquivo));

                // Lê o head do arquivo
                String head = imgArq.readLine();
                if (!head.equals("P2")) {
                        System.out.println("O arquivo não é PGM!");
                }
                // Ignorando comentários
                String info = "";
                do {
                        info = imgArq.readLine();
                } while (info.startsWith("#"));

                // lê largura e altura da imagem
                StringTokenizer st = new StringTokenizer(info, " ");
                largura = Integer.parseInt(st.nextToken());
                altura = Integer.parseInt(st.nextToken());

                // pega o nivel máximo de cinza
                maxValue = Integer.parseInt(imgArq.readLine());

                pixels = new int[largura][altura];

                String dados;
                for (int i = 0; i < altura; i++) {
                        dados = imgArq.readLine();
                        pixels[i] = recorta(dados);
                }
                imgArq.close();
        }

        public ImagemPGM(int largura, int altura, int maxValue, int[][] pixels){
                this.largura = largura;
                this.altura = altura;
                this.maxValue = maxValue;
                this.pixels = pixels;
        }

        private int[] recorta(String entrada) {
                entrada += " ";
                int aux = 0;
                int[] array = new int[largura];
                int index = 0;
                for (int i = 0; i < entrada.length(); i++) {
                        if (entrada.substring(i, i + 1).equals(" ")) {
                                int valor = Integer.parseInt(entrada.substring(aux, i));
                                aux = i + 1;
                                array[index] = valor;
                                index++;
                        }
                }
                return array;
        }

        public BufferedImage geraBuffer() {
                BufferedImage image = new BufferedImage(altura, largura,
                                BufferedImage.TYPE_USHORT_GRAY);
                WritableRaster raster = image.getRaster();

                for (int i = 0; i < altura; i++) {
                        for (int j = 0; j < largura; j++) {
                                raster.setSample(i, j, 0, pixels[j][i]*255);
                        }
                }
                return image;
        }

}