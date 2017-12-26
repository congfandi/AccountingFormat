# AccountingFormat
Accounting Format Library<br/>
Edittext and TextView Accounting format (IDR, USD and Custom) <br/>
youtube : https://youtu.be/nLXjihhx_sk
<br/>

<br/>
to use <br/>
<br/>
//this use for edittext auto format like 1000 => 1,000 etc just type any number<br/>
  <com.congfandi.lib.EditTextRupiah<br/>
        android:id="@+id/counting"<br/>
        android:layout_width="match_parent"<br/>
        android:layout_height="wrap_content"<br/>
        android:layout_below="@+id/oke" /><br/>
        
        to get number only without node, just call<br/>
        counting.getNumber();
        
<br/>
<br/>
<br/>
//this text view have any methode<br/>
   <com.congfandi.lib.TextViewRupiah<br/>
        android:id="@+id/hasil"<br/>
        android:layout_width="wrap_content"<br/>
        android:layout_height="wrap_content" /><br/>
        
//hasil.convertToIDR(); => input from Edittex,TextView and String<br/>
//hasil.convertToDollar();=> input from Edittex,TextView and String<br/>
//hasil.convertCustom();=> input from Edittex,TextView and String<br/>
//hasil.convertCustom("USD", data);//input from Edittext<br/>
//hasil.convertCustom("USD", hasil);//input from TextView<br/>
//hasil.convertCustom("USD", "1234345");//input from String data<br/>
<br/>
for help<br/>
Email : congfandi@gmail.com<br/>
facebook : facebook.com/congfandii<br/>
whatsapp : +62878 5060 3836<br/>
