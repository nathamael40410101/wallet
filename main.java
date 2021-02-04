package main;

import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Blue_print_dompet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner ip = new Scanner(System.in);
		System.out.print("Jumlah merchant:");
		n=ip.nextInt();
		System.out.print("Jumlah User:");
		int n2=ip.nextInt();
		String user []=new String[n2];//variabel user
		String pwu []=new String[n2];
		int idUser []=new int[n2];
		int saldou=0;
		int pilih1[]=new int[n2];
		int bankU[]=new int[n2];
		//validasi
		int cek=0;
		int cek2=0;
		int cek3=0;
		//log
		int log[]=new int[2];
		Date logTime=new Date();
		String log1="";
		String merchant []= new String [n];//variabel merchant
		String pwm[]= new String[n];
		int idMerchant[]=new int[n];
		int saldom=0;
		String barangm[]=new String [n];
		int hargaBrgm[]=new int [n];
		String status="";
		for(int i=0;i<n;i++) {//Daftar Merchant
			System.out.print("Nama Akun Merchant:");
			merchant[i]=ip.next();
			System.out.print("Password:");
			pwm[i]=ip.next();
			int gen1=(int)(Math.random()*322535426);
			int gen2=(int)(Math.random()*0631235)+gen1;
			        idMerchant[i]=(int) (Math.random()*gen2);
		}
		for(int i=0;i<n2;i++) {//Daftar User
			System.out.print("Nama Akun User:");
			user[i]=ip.next();
			System.out.print("Password:");
			pwu[i]=ip.next();
			int gen1=(int)(Math.random()*322535426);
			int gen2=(int)(Math.random()*0631235)+gen1;
			        idUser[i]=(int) (Math.random()*gen2);
			        	for(int j=0;j<n;j++){
			        if(idUser[i]==idMerchant[j]) {//handling eror id sama
			        	gen1=(int)(Math.random()*322535426);
						gen2=(int)(Math.random()*0631235)+gen1;
						        idUser[i]=(int) (Math.random()*gen2);
			        
					}
			        }
		}
		//sistem
		System.out.print("Selamat datang Di sistem Dompetron!");
		
		int counter=0;
		while(counter<=1) {
			System.out.print("\nLogin sebagai:\n1.Merchant\n2.User\nInput:");
			int pilih=ip.nextInt();
		switch(pilih) {
		case 1:
			if(merchant.length==0) {//jika array merchant 0
				System.out.print("Tidak ada merchant ditemukan");
				counter=0;
				break;
			}
			int counter1=0;
			while(counter1<=1) {
			System.out.print("Masuk sebagai Merchant\nNama:");
			String validNamem=ip.next();
			System.out.print("Password:");
			String validPwm=ip.next();
			for(int i=0;i<n;i++) {
				
				if(validNamem .equals(merchant[i]) && validPwm.equals(pwm[i]) ) {
					cek2=i;
					cek=i;
					counter=1;
					counter1=1;
					status="masuk";
				}
			}
			if(! status.equals("masuk")) {
				System.out.println("Akun dan Password anda salah !!!");
				counter1=0;
			}
			counter1++;
			}
				//if(validNamem .equals(merchant[cek2]) && validPwm.equals(pwm[i]) ) {
					System.out.println("Hai "+merchant[cek2]+pwm[cek2]+"!!!");
					status="masuk1";//masuk ke merchant
					if(status=="masuk1") {
						System.out.print("Barang anda Saat ini:"+null+"\nApakah anda ingin mengisi ?\nKetik Y(Ya) atau N(Tidak):");
						String jwb=ip.next();
						if(jwb.equals("Y")) {
							System.out.println("Jumlah barang:"+n);
							System.out.print("Masukkan Barang serta harganya:");
							for(int j=0;j<n;j++) {
								System.out.print("Nama barang ("+(j+1)+"):");
								barangm[j]=ip.next();
								System.out.print("Harga barang ("+(j+1)+"):");
								hargaBrgm[j]=ip.nextInt();
								status="masuk2";
							}
						}else {
						status="masuk3";//panggil user
						}
					}
			break;
		case 2:
			int counter2=0;
			while(counter2<=1) {
				if(user.length==0) {//jika array user 0
					System.out.print("Tidak ada user ditemukan");
					counter2=0;
					break;
				}	
			System.out.print("Masuk sebagai User\nNama:");
			String validNameu=ip.next();
			System.out.print("Password:");
			String validPwu=ip.next();
			for(int i=0;i<n2;i++) {
				if((validNameu .equals(user[i])) && (validPwu.equals(pwu[i]))  ) {
					System.out.println("Hai "+user[i]);
					status="masuk3";
					counter=1;
					counter2=1;
				}
			}if(! status.equals("masuk3")){
				System.out.println("Nama dan Password anda salah!");
				counter2=0;
			}
			counter2++;
			}
			break;
		default:
			System.out.println("Pilihan anda tidak ditemukan!");
			counter=0;
			break;
			
		}
		counter++;
		}
		if(status.equals("masuk2")) {//masuk user
			int counter2=0;
			while(counter2<=1) {
			System.out.print("Masuk sebagai User\nNama:");
			String validNameu=ip.next();
			System.out.print("Password:");
			String validPwu=ip.next();
			for(int i=0;i<n;i++) {
				if((validNameu .equals(user[i])) && (validPwu.equals(pwu[i]))  ) {
					System.out.println("Hai "+user[i]+"!");
					status="masuk2";
					counter=1;
					counter2=1;
					cek3=i;
					System.out.print("Saldo anda saat ini "+saldom+"\nApakah anda ingin mengisi?(Y/N)");
					String jwb=ip.next();
					if(jwb.equals("Y")) {
						System.out.print("Isi saldo:");	
						bankU[cek3]=ip.nextInt();
						System.out.print("Ingin beli barang dengan Id merchant ?"+cek+".("+idMerchant[cek]+")"+"(Y/N:)");
					jwb=ip.next();
					if(jwb.equals("Y")) {
						System.out.print("Masukkan id Merchant:");
						int counter3=0;
						while(counter3<=1) {
							int pilih2=ip.nextInt();
							for(int j=0;j<n;j++) {
							if(idMerchant[j]==pilih2) {
								counter3=1;	
								cek=j;
							}
							}if(idMerchant[cek] != pilih2) {
								System.out.print("Id merchant anda salah");
								counter3=0;
							}
							counter3++;
						}
						System.out.print("Pilih barang:");	
						int totalHrg=0;
						for(int j=0;j<n;j++) {
							System.out.print(i+"."+barangm[j]+" (Rp."+hargaBrgm[j]+")");
							System.out.print("Beli:");
							 pilih1[j]=ip.nextInt();
							if(pilih1[j]==j) {
								totalHrg += hargaBrgm[j];
							}if(pilih1[j]==0) {
								bankU[cek3]=bankU[cek3]-0;
								saldom=saldom+0;
							}else {
								System.out.print("Input anda salah !");
								j=j-1;
							}
						}System.out.print
						("Anda Yakin ingin membeli barang dengan harga Rp."+totalHrg+"?(Y/N):");
						jwb=ip.next();
						if(jwb.equals("Y")) {
							if(bankU[cek3] < totalHrg) {
							System.out.println("Saldo anda tidak cukup");
							status="masuk3";
						}else {
							bankU[cek3]=bankU[cek3]-totalHrg;
							saldom=saldom+totalHrg;
							System.out.println("Saldo anda tinggal :"+bankU[cek3]);
							status="masuk3";
						}
						counter3++;
						
					}else {
						System.out.print("terimakasih telah berkunjung");
						break;
					}
					}else {
						System.out.print("Terima kasih, Mungkin lain waktu");
						status="masuk3";
					}
				}else {
					System.out.println("Saldo anda masih "+bankU[cek3]);
					status="masuk3";
				}
			}else {
				System.out.println("Akun dan Password anda salah");
				counter2=0;
			}
			counter2++;
			}
		}
		}if(status.equals("masuk3")) {
			int counter2=0;
			while(counter2<=1) {
			System.out.print("Masuk sebagai User\nNama:");
			String validNameu=ip.next();
			System.out.print("Password:");
			String validPwu=ip.next();
			for(int i=0;i<n2;i++) {
				if((validNameu .equals(user[i])) && (validPwu.equals(pwu[i]))  ) {
					System.out.println("Hai "+user[i]+"!");
					counter=1;
					counter2=1;
					cek=i;
					System.out.println("Saldo anda saat ini "+bankU[cek]+"\nApakah anda ingin mengisi?(Y/N)");
					String jwb=ip.next();
					if(jwb.equals("Y")) {
						System.out.print("Isi saldo:");	
						saldou=ip.nextInt();
						bankU[cek]=bankU[cek]+saldou;
						System.out.println("Apakah anda ingin Transfer Saldo?");
						int counter3=0;
						while(counter3<=1) {
						System.out.println("Cari nama User:");
						jwb=ip.next();
						for(i=0;i<n2;i++) {
						if(jwb.equals(user[i])) {
							if(jwb.equals(validNameu)) {
								System.out.print("Anda Tidak dapat mengirim ke akun anda Sendiri!");
								counter3=0;
							}else {
							System.out.print("User "+user[i]+" telah ditemukan dengan id "+idUser[i]);
							System.out.print(" Apakah anda yakin untuk mengirim uang?(Y/N):");
							jwb=ip.next();
							if(jwb.equals("Y")){
								System.out.print("Nominal Rp:");
							int	SaveAgk=ip.nextInt();
								if((bankU[cek] - SaveAgk) < 5000) {
									System.out.print("Saldo yang tersisa harus minimal 5000");
									status="masuk3";
								}else {
									bankU[cek]=bankU[cek]-SaveAgk;
									log[0]=idUser[cek];
									bankU[i]=SaveAgk;
									log[1]=idUser[i];
									cek2=i;
									log1=logTime.toString();
									System.out.println("Saldo anda tinggal Rp."+bankU[cek]);
									counter3=1;
									status="masuk3";
								}
							}else {
								idUser[i]=0;
							}
							}
						}
						}
						counter3++;
						}
					}else {
						System.out.print("Saldo anda "+saldou);	
					}
				}
			}if(! status.equals("masuk3")) {
				System.out.print("Akun dan password anda salah");	
				counter2=0;
			}
			counter2++;
			}
		}
		//periksa saldo
		int counter2=0;
		while(counter2<n2) {
		System.out.println("Masuk sebagai User\nNama:");
		String validNameu=ip.next();
		System.out.print("Password:");
		String validPwu=ip.next();
		for(int i=0;i<n2;i++) {
			if((validNameu .equals(user[i])) && (validPwu.equals(pwu[i]))  ) {
				System.out.print("Apakah anda ingin memeriksa saldo?(Y/N):");
			String	jwb=ip.next();
				if(jwb.equals("Y")){
					System.out.println("Saldo anda Rp."+bankU[i]);
					if(user[i].equals(user[cek])) {
						System.out.println("Anda telah mengirim saldo ke user "+idUser[cek2]+"\nWaktu:"+log1);
						status="masuk4";
					}if(user[i].equals(user[cek2])) {
						System.out.println("Anda telah menerima saldo dari user "+idUser[cek]+"\nWaktu:"+log1);
						status="masuk4";
					}
				}else {
					System.out.print("Terima kasih");
					status="masuk4";
				}
			}
		}if(! status.equals("masuk4")){
			System.out.println("Akun atau Password anda salah");
		}
		
		counter2++;
		}
	}

}
