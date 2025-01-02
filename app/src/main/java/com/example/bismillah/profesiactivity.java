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

public class profesiactivity extends AppCompatActivity {
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

        // Tambahkan item ke contentLayout (kosakata profesi)
        addItem(contentLayout, "Akuntan", "مُحَاسِبٌ");
        addItem(contentLayout, "Arsitek", "مُهَندِسٌ");
        addItem(contentLayout, "Dokter", "طَبِيبٌ");
        addItem(contentLayout, "Fotografer", "مُصَوِّرٌ");
        addItem(contentLayout, "Guru", "مُعَلِّمٌ");
        addItem(contentLayout, "Juru Masak", "طَبَّاخٌ");
        addItem(contentLayout, "Karyawan", "عَامِلٌ");
        addItem(contentLayout, "Kepala Sekolah", "مُدِيرٌ");
        addItem(contentLayout, "Konsultan", "مُسْتَشَارٌ");
        addItem(contentLayout, "Manajer", "مُدِيرٌ");
        addItem(contentLayout, "Pekerja Sosial", "عَامِلٌ اجْتِمَاعِيٌّ");
        addItem(contentLayout, "Pemadam Kebakaran", "رَجُلُ الإِطْفَاءِ");
        addItem(contentLayout, "Pengacara", "مُحَامٍ");
        addItem(contentLayout, "Pengasuh", "مُرَبٍّ");
        addItem(contentLayout, "Petani", "فَلاَّحٌ");
        addItem(contentLayout, "Penyiar", "مُذِيعٌ");
        addItem(contentLayout, "Polisi", "ضَابِطٌ");
        addItem(contentLayout, "Programmer", "مُبَرْمِجٌ");
        addItem(contentLayout, "Psikolog", "عَالِمُ النَّفْسِ");
        addItem(contentLayout, "Sekretaris", "أَمِينٌ");
        addItem(contentLayout, "Seniman", "فَنَّانٌ");
        addItem(contentLayout, "Teller", "صَارِفٌ");
        addItem(contentLayout, "Tukang Kayu", "نَجَّارٌ");
        addItem(contentLayout, "Translator", "مُتَرْجِمٌ");
        addItem(contentLayout, "Wartawan", "مُدَوِّنٌ");
        addItem(contentLayout, "Analis Keuangan", "مُحَلِّلٌ مَالِيٌّ");
        addItem(contentLayout, "Asisten Rumah Tangga", "مُسَاعِدَةٌ فِي الْمَنْزِلِ");
        addItem(contentLayout, "Chef", "شَيْفٌ");
        addItem(contentLayout, "Direktur", "مُدِيرٌ");
        addItem(contentLayout, "Ekonom", "عَالِمٌ اِقْتِصَادِيٌّ");
        addItem(contentLayout, "Editor", "مُحَرِّرٌ");
        addItem(contentLayout, "Ekspeditor", "مُوَجِّهٌ");
        addItem(contentLayout, "Fashion Designer", "مُصَمِّمٌ أَزْيَاءٌ");
        addItem(contentLayout, "Insinyur", "مُهَنْدِسٌ");
        addItem(contentLayout, "Ibu Rumah Tangga", "رَبَّةُ بَيْتٍ");
        addItem(contentLayout, "Jurnalis", "صَحَفِيٌّ");
        addItem(contentLayout, "Laboratoris", "فَنِّيٌّ مَعْمَلٌ");
        addItem(contentLayout, "Penerjemah", "مُتَرْجِمٌ");
        addItem(contentLayout, "Penyelidik", "مُحَقِّقٌ");
        addItem(contentLayout, "Sopir", "سَائِقٌ");

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
        titleText.setText("Profesi");
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
