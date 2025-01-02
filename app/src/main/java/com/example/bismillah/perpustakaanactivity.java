package com.example.bismillah;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class perpustakaanactivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Root RelativeLayout sebagai container utama
        RelativeLayout rootLayout = new RelativeLayout(this);
        rootLayout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT));
        rootLayout.setBackgroundColor(Color.parseColor("#F3F0FF"));

        // Title Bar
        LinearLayout titleBar = createTitleBar();
        titleBar.setId(View.generateViewId()); // Tetapkan ID ke titleBar
        rootLayout.addView(titleBar);

        // ScrollView untuk konten utama
        ScrollView scrollView = new ScrollView(this);
        RelativeLayout.LayoutParams scrollViewParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        scrollViewParams.addRule(RelativeLayout.BELOW, titleBar.getId()); // Gunakan ID titleBar
        scrollView.setLayoutParams(scrollViewParams);

        // LinearLayout untuk isi di dalam ScrollView
        LinearLayout contentLayout = new LinearLayout(this);
        contentLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        contentLayout.setOrientation(LinearLayout.VERTICAL);
        contentLayout.setPadding(16, 16, 16, 16);

        // Tambahkan item ke contentLayout (disusun sesuai abjad)
        addItem(contentLayout, "Audio Book", "كِتَابٌ صَوْتِيٌ");
        addItem(contentLayout, "Buku", "كِتَابِ");
        addItem(contentLayout, "Buku Bergambar", "كِتَابٌ مَرْسُومٌ");
        addItem(contentLayout, "Buku Referensi", "مَرْجِعٌ كِتَابِيٌّ");
        addItem(contentLayout, "Catatan", "مُذَكِّرَةٌ");
        addItem(contentLayout, "Ceklis", "قَائِمَةٌ");
        addItem(contentLayout, "Encyclopedia", "مُعْجَمٌ");
        addItem(contentLayout, "Fasilitas Internet", "خِدْمَةُ الإِنْتَرْنِتِ");
        addItem(contentLayout, "Fasilitas Wifi", "خِدْمَةُ الواي فاي");
        addItem(contentLayout, "Kartu Anggota", "بِطَاقَةُ الأَعْضَاءُ");
        addItem(contentLayout, "Katalog", "فَهرَسٌ");
        addItem(contentLayout, "Komik", "كُومِيكٌ");
        addItem(contentLayout, "Komputer", "جَاهِزٌ حَاسُوبٌ");
        addItem(contentLayout, "Konsultasi", "استِشَارَةٌ");
        addItem(contentLayout, "Kursi Baca", "كُرْسِيٌّ لِلْقِرَاءَةِ");
        addItem(contentLayout, "Lampiran", "مُلْحَقٌ");
        addItem(contentLayout, "Lemari Arsip", "خِزَانَةُ الأَورَاقِ");
        addItem(contentLayout, "Majalah", "مَجَلَّةٌ");
        addItem(contentLayout, "Meja Baca", "طَاوِلَةٌ لِلْقِرَاءَةِ");
        addItem(contentLayout, "Microfilm", "مِيكْرُوفِيلْمٌ");
        addItem(contentLayout, "Penerbit", "نَاشِرٌ");
        addItem(contentLayout, "Peta", "خَرِيطَةٌ");
        addItem(contentLayout, "Perpustakaan Digital", "مَكْتَبَةٌ رَقْمِيَّةٌ");
        addItem(contentLayout, "Pinjaman", "إعَارَةٌ");
        addItem(contentLayout, "Printer", "طَابِعَةٌ");
        addItem(contentLayout, "Ruang Diskusi", "غُرْفَةٌ لِلنِّقَاشِ");
        addItem(contentLayout, "Rak", "رَفٌّ");
        addItem(contentLayout, "Referensi", "مَرْجِعٌ");
        addItem(contentLayout, "Scanner", "جِهَازُ فَحْصِ النُّسَخِ");
        addItem(contentLayout, "Stiker", "دَبْلُومٌ");
        addItem(contentLayout, "Studi Kasus", "دِرَاسَةُ حَالَةٌ");
        addItem(contentLayout, "Tabel", "جَدْوَلٌ");
        addItem(contentLayout, "Teori", "نَظَرِيَّةٌ");
        addItem(contentLayout, "Teks", "نَصٌّ");
        addItem(contentLayout, "Tinjauan", "مُرَاجَعَةٌ");
        addItem(contentLayout, "Transkrip", "نُسْخَةٌ");
        addItem(contentLayout, "Ulasan", "مُرَاجَعَةٌ");
        addItem(contentLayout, "Wartawan", "مُدَوِّنٌ");

        scrollView.addView(contentLayout);
        rootLayout.addView(scrollView);

        setContentView(rootLayout);
    }

    private LinearLayout createTitleBar() {
        LinearLayout titleBar = new LinearLayout(this);
        titleBar.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT));
        titleBar.setBackgroundColor(Color.parseColor("#E8DAFF"));
        titleBar.setPadding(16, 16, 16, 16);
        titleBar.setGravity(Gravity.CENTER);

        TextView titleText = new TextView(this);
        titleText.setText("Perpustakaan");
        titleText.setTextColor(Color.parseColor("#7A52C8"));
        titleText.setTextSize(32);
        titleText.setGravity(Gravity.CENTER);
        titleText.setPadding(16, 0, 16, 0);
        titleBar.addView(titleText);

        return titleBar;
    }

    private void addItem(LinearLayout parent, String leftText, String rightText) {
        LinearLayout itemLayout = new LinearLayout(this);
        LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        itemParams.setMargins(0, 16, 0, 16); // Tambahkan margin lebih besar antar item
        itemLayout.setLayoutParams(itemParams);
        itemLayout.setOrientation(LinearLayout.HORIZONTAL);
        itemLayout.setPadding(16, 20, 16, 20); // Tambahkan padding lebih besar di dalam item
        itemLayout.setGravity(Gravity.CENTER);
        itemLayout.setBackground(createRoundedBackground());

        // Left TextView
        TextView leftTextView = new TextView(this);
        leftTextView.setLayoutParams(new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
        leftTextView.setText(leftText);
        leftTextView.setTextColor(Color.parseColor("#7A52C8")); // Warna ungu untuk teks
        leftTextView.setTextSize(23);
        leftTextView.setGravity(Gravity.CENTER);

        // Right TextView
        TextView rightTextView = new TextView(this);
        rightTextView.setLayoutParams(new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
        rightTextView.setText(rightText);
        rightTextView.setTextColor(Color.parseColor("#7A52C8")); // Warna ungu untuk teks
        rightTextView.setTextSize(25);
        rightTextView.setGravity(Gravity.CENTER);

        itemLayout.addView(leftTextView);
        itemLayout.addView(rightTextView);
        parent.addView(itemLayout);
    }

    private GradientDrawable createRoundedBackground() {
        GradientDrawable background = new GradientDrawable();
        background.setCornerRadius(16);
        background.setColor(Color.parseColor("#EADCF9")); // Warna ungu lebih muda
        return background;
    }
}
