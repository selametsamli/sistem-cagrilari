#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<locale.h>

int main(){
	char d_adi_yolu[256],d_adi_yolu2[256];
	int sonuc=0;
	
	while(sonuc==0){
		printf("Girdi dosyasi: ");
		scanf("%s",d_adi_yolu);
		printf("Cikis dosyasi: ");
		scanf("%s",d_adi_yolu2);
		
		FILE *filep = fopen(d_adi_yolu,"r+");
		FILE *filep2 = fopen(d_adi_yolu2,"r+");
		if(filep==NULL){
				printf("dosya bulunamadi.\n");
				sonuc==0;
			}else if(filep2==NULL){
				printf("Hatali giris yaptýnýz.\n");
				sonuc==0;
			}else{
				
				while(!feof(filep)){			
					fputc(fgetc(filep),filep2); //veriyi dosyaya yazar		
					}
				printf("Basarili\n");
				sonuc=1;
			}
		fclose(filep);
		fclose(filep2);	
	}
	return 0;
}
