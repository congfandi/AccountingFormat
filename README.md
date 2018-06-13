# AccountingFormat
Convert TextView and Edittext To acounting format

## How to 
**Step 1.** Add the JitPack repository to your build file
```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  **Step 2.** Add the dependency
```gradle
dependencies {
	        implementation 'com.github.congfandi:AccountingFormat:0.0.1'
	}
  ```
  **Step 3.** implementation code
  ```xml

    <com.congfandi.lib.EditTextRupiah
        android:id="@+id/counting"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/oke" />

    <com.congfandi.lib.TextViewRupiah
        android:id="@+id/hasil"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
```
```java
        final EditTextRupiah count = findViewById(R.id.counting);//auto convert
        final TextViewRupiah hasil = findViewById(R.id.hasil);//Have 3 methode
                  Log.d("TAG", "result: "+count.getNumber());//getting number from edittex

                hasil
                        .setSeparator(Separator.COMA)//separator of Textview mode. Separator.COMA = (,) and Separator.DOT = (.)
                        .convertCustom("USD", "1234");//custom textview show
 ```
 **All Method**
 ```java
 //TextView
    convertToIDR(EditText input)
    convertToIDR(TextView input) 
    convertToIDR(String input)
    convertToDollar(EditText input)
    convertToDollar(TextView input)
    convertToDollar(String input) 
    convertCustom(String format, EditText input)
    convertCustom(String format, TextView input)
    
  
   //Edittext
    getNumber()//return string without separator
 ```
  **Step 4.** enjoy
 ##
for help
**Email :** congfandi@gmail.com
**facebook :** facebook.com/congfandii
**whatsapp :** +62878 5060 3836
