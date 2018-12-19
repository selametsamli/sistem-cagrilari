sayac=0
while(sayac==0):
	d_adi_yol_1=input("Girdi dosyasini giriniz: ")
	d_adi_yol_2=input("Cikti dosyasini giriniz: ")
	try:
		with open(d_adi_yol_1,"r") as d_kopyala:
			veri=d_kopyala.read()
			sayac=1
		with open(d_adi_yol_2,"a") as d_kopyala2:
			d_kopyala2.write(veri)
			print("Islem basarili")
			sayac=1
	except FileNotFoundError:
		sayac=0
		print("Dosya bulunamadi")
	except IOError:
		sayac=0
		print("Dosya bulunamadi.")




