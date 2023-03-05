import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Aplikasi app = new Aplikasi();
		Scanner input = new Scanner(System.in);
		TombolPembelian tombol = new TombolPembelian();
		int gameChoice;
		int hargaBiaya = 0;

		System.out.println("\n Selamat Datang di Warung Top Up game UNIPIN");
		try {

			System.out.println("JENIS GAME\n =================");
			System.out.println("1. genshin");
			System.out.println("2. Mobile Lagend");
			System.out.println("3. PUBG");
			System.out.println("4. Fire fire");
			System.out.println("9. Gak jadi");

			System.out.print("Pilih game yang ingin di top up (1-4): ");
			gameChoice = input.nextInt();
			
			while (gameChoice < 1 || gameChoice > 3) {
				System.out.print("Pilihan game tidak valid. Pilih game yang ingin di top up (1-3): ");
				System.exit(0);
				gameChoice = input.nextInt();
			}
			
			// menampilkan biaya top up dan meminta input top up amount
			switch (gameChoice) {
				case 1:
					System.out.println("Biaya top up genshin  = Rp 1.000");
					break;
				case 2:
					System.out.println("Biaya top up Mobile Legends  = Rp 5.000");
					break;
				case 3:
					System.out.println("Biaya top up Free Fire: Rp 20.000");
					break;
				case 4:
					System.out.println("Biaya top up PUBG Mobile: Rp 30.000");
					break;
				default:
					break;
			}
			if (gameChoice == 1) {
				hargaBiaya = 1000;
			} else if (gameChoice == 2) {
				hargaBiaya = 5000;
			} else if (gameChoice == 3) {
				hargaBiaya = 20000;
			} else {
				hargaBiaya = 30000;
			}

			System.out.println("Masukan ID player kamu: ");
			String idPlayer = input.next();
			System.out.println("Masukan point yang ingin dibeli: ");
			Integer pointValo = input.nextInt();

			
			// Metode Pembayaran
			System.out.println("Pilih metode pembayaran");
			System.out.println("1. Gopay");
			System.out.println("2. Dana");
			System.out.println("3. Ovo");
			System.out.println("9. Gak jadi");
			System.out.println("Pilih Pembayaran:");
			Integer inputPay = input.nextInt();
			input.close();
			
			// id akun, jumlah point
			Unipin valo = new Unipin(idPlayer, pointValo, hargaBiaya);
			// Harga Point jumlah item * 120			
				if(inputPay == 1){
					Gopay gopay = new Gopay(200000);
					tombol.connectTo(app);
					app.connectTo(valo, gopay);
				}	
				else if(inputPay == 2){
					Dana dana = new Dana(100000);
					tombol.connectTo(app);
					app.connectTo(valo, dana);
				}	
				else if(inputPay == 3){
					Ovo ovo = new Ovo(150000);
					tombol.connectTo(app);
					app.connectTo(valo, ovo);
				}	
				else if (inputPay == 9){
					System.out.println("Terima kasih telah melihat warung top up");
				} 
				else{
					System.out.println("Metode Pembayaran tidak ada...");
				}
		} catch (Exception e) {
			System.out.println("Pembelian gagal...");
		} finally{
			tombol.tekan();
			System.out.println("Terima Kasih telah berkunjung ke toko kami.");
		}
	}
}
