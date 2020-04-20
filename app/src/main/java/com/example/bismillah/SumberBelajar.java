package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class SumberBelajar extends AppCompatActivity {
    LinearLayout linearLayoutSlb, linearLayoutDefault, linearLayoutPaud,linearLayoutSd, linearLayoutSmp,linearLayoutSma,linearLayoutSmk,
    linearLayoutKelasSlb, linearLayoutKelasDefault, linearLayoutKelasPaud1, linearLayoutKelasPaud2,linearLayoutKelasPaud3,
    linearLayoutKelasSmpVII,linearLayoutKelasSmpVIII,linearLayoutKelasSmpIX,
    linearLayoutKelasSmaX,linearLayoutKelasSmaXI,linearLayoutKelasSmaXII,
    linearLayoutKelasSmkX,linearLayoutKelasSmkXI,linearLayoutKelasSmkXII,
    linearLayoutKelasSd1,linearLayoutKelasSd2,linearLayoutKelasSd3,linearLayoutKelasSd4,linearLayoutKelasSd5,linearLayoutKelasSd6;
    ImageButton slb,Bdefault,paud,sd,smp,sma,smk,
    KelasSlb,KelasDefault,KelasPaud1,KelasPaud2,KelasPaud3,
    KelasSd1,KelasSd2,KelasSd3,KelasSd4,KelasSd5,KelasSd6,
    KelasSmpVII,KelasSmpVIII, KelasSmpIX,
    KelasSmaX,KelasSmaXI,KelasSmaXII,
    KelasSmkX,KelasSmkXI,KelasSmkXII;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumber_belajar);

        final boolean[] statusSlb = {true};
        final boolean[] statusDefault = {true};
        final boolean[] statusPaud = {true};
        final boolean[] statusSd = {true};
        final boolean[] statusSmp = {true};
        final boolean[] statusSma = {true};
        final boolean[] statusSmk = {true};

        final boolean[] kelasSlb = {true};
        final boolean[] kelasDefault = {true};
        final boolean[] kelasPaud1 = {true};
        final boolean[] kelasPaud2 = {true};
        final boolean[] kelasPaud3 = {true};

        final boolean[] kelasSd1 = {true};
        final boolean[] kelasSd2 = {true};
        final boolean[] kelasSd3 = {true};
        final boolean[] kelasSd4 = {true};
        final boolean[] kelasSd5 = {true};
        final boolean[] kelasSd6 = {true};

        final boolean[] kelasSmp1 = {true};
        final boolean[] kelasSmp2 = {true};
        final boolean[] kelasSmp3 = {true};

        final boolean[] kelasSma1 = {true};
        final boolean[] kelasSma2 = {true};
        final boolean[] kelasSma3 = {true};

        final boolean[] kelasSmk1 = {true};
        final boolean[] kelasSmk2 = {true};
        final boolean[] kelasSmk3 = {true};


        linearLayoutSlb = findViewById(R.id.klik_slb);
        linearLayoutDefault = findViewById(R.id.klik_default);
        linearLayoutPaud = findViewById(R.id.klik_paud);
        linearLayoutSd = findViewById(R.id.klik_sd);
        linearLayoutSmp = findViewById(R.id.klik_smp);
        linearLayoutSma = findViewById(R.id.klik_sma);
        linearLayoutSmk = findViewById(R.id.klik_smk);

        linearLayoutKelasSlb = findViewById(R.id.mapel_slb);
        linearLayoutKelasDefault = findViewById(R.id.mapel_default);
        linearLayoutKelasSd1 = findViewById(R.id.mapel_sd1);
        linearLayoutKelasSd2 = findViewById(R.id.mapel_sd2);
        linearLayoutKelasSd3 = findViewById(R.id.mapel_sd3);
        linearLayoutKelasSd4 = findViewById(R.id.mapel_sd4);
        linearLayoutKelasSd5 = findViewById(R.id.mapel_sd5);
        linearLayoutKelasSd6 = findViewById(R.id.mapel_sd6);
        linearLayoutKelasPaud1 = findViewById(R.id.mapel_paud1);
        linearLayoutKelasPaud2 = findViewById(R.id.mapel_paud2);
        linearLayoutKelasPaud3 = findViewById(R.id.mapel_paud3);
        linearLayoutKelasSmpVII = findViewById(R.id.mapel_smp_vii);
        linearLayoutKelasSmpVIII = findViewById(R.id.mapel_smp_viii);
        linearLayoutKelasSmpIX = findViewById(R.id.mapel_smp_ix);
        linearLayoutKelasSmaX = findViewById(R.id.mapel_sma_x);
        linearLayoutKelasSmaXI = findViewById(R.id.mapel_sma_xi);
        linearLayoutKelasSmaXII = findViewById(R.id.mapel_sma_xii);
        linearLayoutKelasSmkX = findViewById(R.id.mapel_smk_x);
        linearLayoutKelasSmkXI = findViewById(R.id.mapel_smk_xi);
        linearLayoutKelasSmkXII = findViewById(R.id.mapel_smk_xii);


        slb = findViewById(R.id.button_slb);
        Bdefault = findViewById(R.id.button_default);
        paud = findViewById(R.id.button_paud);
        sd = findViewById(R.id.button_sd);
        smp = findViewById(R.id.button_smp);
        sma = findViewById(R.id.button_sma);
        smk = findViewById(R.id.button_smk);

        KelasSlb = findViewById(R.id.kelas_slb);
        KelasDefault = findViewById(R.id.kelas_default);
        KelasPaud1 = findViewById(R.id.kelas_paud1);
        KelasPaud2 = findViewById(R.id.kelas_paud2);
        KelasPaud3 = findViewById(R.id.kelas_paud3);
        KelasSd1 = findViewById(R.id.kelas_sd1);
        KelasSd2 = findViewById(R.id.kelas_sd2);
        KelasSd3 = findViewById(R.id.kelas_sd3);
        KelasSd4 = findViewById(R.id.kelas_sd4);
        KelasSd5 = findViewById(R.id.kelas_sd5);
        KelasSd6 = findViewById(R.id.kelas_sd6);
        KelasSmpVII = findViewById(R.id.kelas_smp1);
        KelasSmpVIII = findViewById(R.id.kelas_smp2);
        KelasSmpIX = findViewById(R.id.kelas_smp3);
        KelasSmaX = findViewById(R.id.kelas_sma1);
        KelasSmaXI = findViewById(R.id.kelas_sma2);
        KelasSmaXII = findViewById(R.id.kelas_sma3);
        KelasSmkX = findViewById(R.id.kelas_smk1);
        KelasSmkXI = findViewById(R.id.kelas_smk2);
        KelasSmkXII = findViewById(R.id.kelas_smk3);





        slb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusSlb[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutSmk.setVisibility(View.INVISIBLE);
                    linearLayoutSma.setVisibility(View.INVISIBLE);
                    linearLayoutSmp.setVisibility(View.INVISIBLE);
                    linearLayoutDefault.setVisibility(View.INVISIBLE);
                    linearLayoutPaud.setVisibility(View.INVISIBLE);
                    linearLayoutSd.setVisibility(View.INVISIBLE);
                    linearLayoutSlb.setVisibility(View.VISIBLE);
                    statusSlb[0] = false;
                }else {
                    statusSlb[0] = true;
                }
            }
        });
        Bdefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusDefault[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutSmk.setVisibility(View.INVISIBLE);
                    linearLayoutSma.setVisibility(View.INVISIBLE);
                    linearLayoutSmp.setVisibility(View.INVISIBLE);
                    linearLayoutSlb.setVisibility(View.INVISIBLE);
                    linearLayoutPaud.setVisibility(View.INVISIBLE);
                    linearLayoutSd.setVisibility(View.INVISIBLE);
                    linearLayoutDefault.setVisibility(View.VISIBLE);
                    statusDefault[0] = false;
                }else {
                    statusDefault[0] = true;
                }
            }
        });
        paud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusPaud[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutSmk.setVisibility(View.INVISIBLE);
                    linearLayoutSma.setVisibility(View.INVISIBLE);
                    linearLayoutSmp.setVisibility(View.INVISIBLE);
                    linearLayoutSlb.setVisibility(View.INVISIBLE);
                    linearLayoutDefault.setVisibility(View.INVISIBLE);
                    linearLayoutSd.setVisibility(View.INVISIBLE);
                    linearLayoutPaud.setVisibility(View.VISIBLE);
                    statusPaud[0] = false;
                }else {
                    statusPaud[0] = true;
                }
            }
        });
        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusSd[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutSmk.setVisibility(View.INVISIBLE);
                    linearLayoutSma.setVisibility(View.INVISIBLE);
                    linearLayoutSmp.setVisibility(View.INVISIBLE);
                    linearLayoutSlb.setVisibility(View.INVISIBLE);
                    linearLayoutDefault.setVisibility(View.INVISIBLE);
                    linearLayoutPaud.setVisibility(View.INVISIBLE);
                    linearLayoutSd.setVisibility(View.VISIBLE);
                    statusSd[0] = false;
                }else {
                    statusSd[0] = true;
                }
            }
        });
        smp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusSmp[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutSmk.setVisibility(View.INVISIBLE);
                    linearLayoutSma.setVisibility(View.INVISIBLE);
                    linearLayoutSd.setVisibility(View.INVISIBLE);
                    linearLayoutSlb.setVisibility(View.INVISIBLE);
                    linearLayoutDefault.setVisibility(View.INVISIBLE);
                    linearLayoutPaud.setVisibility(View.INVISIBLE);
                    linearLayoutSmp.setVisibility(View.VISIBLE);
                    statusSmp[0] = false;
                }else {
                    statusSmp[0] = true;
                }
            }
        });
        sma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusSma[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutSmk.setVisibility(View.INVISIBLE);
                    linearLayoutSd.setVisibility(View.INVISIBLE);
                    linearLayoutSlb.setVisibility(View.INVISIBLE);
                    linearLayoutDefault.setVisibility(View.INVISIBLE);
                    linearLayoutPaud.setVisibility(View.INVISIBLE);
                    linearLayoutSmp.setVisibility(View.INVISIBLE);
                    linearLayoutSma.setVisibility(View.VISIBLE);
                    statusSma[0] = false;
                }else {
                    statusSma[0] = true;
                }
            }
        });
        smk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusSmk[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutSd.setVisibility(View.INVISIBLE);
                    linearLayoutSlb.setVisibility(View.INVISIBLE);
                    linearLayoutDefault.setVisibility(View.INVISIBLE);
                    linearLayoutPaud.setVisibility(View.INVISIBLE);
                    linearLayoutSmp.setVisibility(View.INVISIBLE);
                    linearLayoutSma.setVisibility(View.INVISIBLE);
                    linearLayoutSmk.setVisibility(View.VISIBLE);
                    statusSmk[0] = false;
                }else {
                    statusSmk[0] = true;
                }
            }
        });
        KelasSlb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSlb[0] == true) {
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSlb.setVisibility(View.VISIBLE);
                    kelasSlb[0] = false;
                }else {
                    kelasSlb[0] = true;
                }
            }
        });
        KelasDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasDefault[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasDefault.setVisibility(View.VISIBLE);
                    kelasDefault[0] = false;
                }else {
                    kelasDefault[0] = true;
                }
            }
        });
        KelasPaud1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasPaud1[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasPaud1.setVisibility(View.VISIBLE);
                    kelasPaud1[0] = false;
                }else {
                    kelasPaud1[0] = true;
                }
            }
        });
        KelasPaud2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasPaud2[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasPaud2.setVisibility(View.VISIBLE);
                    kelasPaud2[0] = false;
                }else {
                    kelasPaud2[0] = true;
                }
            }
        });
        KelasPaud3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasPaud3[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasPaud3.setVisibility(View.VISIBLE);
                    kelasPaud3[0] = false;
                }else {
                    kelasPaud3[0] = true;
                }
            }
        });
        KelasSmpVII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSmp1[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmpVII.setVisibility(View.VISIBLE);
                    kelasSmp1[0] = false;
                }else {
                    kelasSmp1[0] = true;
                }
            }
        });
        KelasSmpVIII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSmp2[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmpVIII.setVisibility(View.VISIBLE);
                    kelasSmp2[0] = false;
                }else {
                    kelasSmp2[0] = true;
                }
            }
        });
        KelasSmpIX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSmp3[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmpIX.setVisibility(View.VISIBLE);
                    kelasSmp3[0] = false;
                }else {
                    kelasSmp3[0] = true;
                }
            }
        });
        KelasSmaX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSma1[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmaX.setVisibility(View.VISIBLE);
                    kelasSma1[0] = false;
                }else {
                    kelasSma1[0] = true;
                }
            }
        });
        KelasSmaXI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSma2[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmaXI.setVisibility(View.VISIBLE);
                    kelasSma2[0] = false;
                }else {
                    kelasSma2[0] = true;
                }
            }
        });
        KelasSmaXII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSma3[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmaXII.setVisibility(View.VISIBLE);
                    kelasSma3[0] = false;
                }else {
                    kelasSma3[0] = true;
                }
            }
        });
        KelasSmkX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSmk1[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmkX.setVisibility(View.VISIBLE);
                    kelasSmk1[0] = false;
                }else {
                    kelasSmk1[0] = true;
                }
            }
        });
        KelasSmkXI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSmk2[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmkXI.setVisibility(View.VISIBLE);
                    kelasSmk2[0] = false;
                }else {
                    kelasSmk2[0] = true;
                }
            }
        });
        KelasSmkXII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSmk3[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmkXII.setVisibility(View.VISIBLE);
                    kelasSmk3[0] = false;
                }else {
                    kelasSmk3[0] = true;
                }
            }
        });
        KelasSd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSd1[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSd1.setVisibility(View.VISIBLE);
                    kelasSd1[0] = false;
                }else {
                    kelasSd1[0] = true;
                }
            }
        });
        KelasSd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSd2[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSd2.setVisibility(View.VISIBLE);
                    kelasSd2[0] = false;
                }else {
                    kelasSd2[0] = true;
                }
            }
        });
        KelasSd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSd3[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSd3.setVisibility(View.VISIBLE);
                    kelasSd3[0] = false;
                }else {
                    kelasSd3[0] = true;
                }
            }
        });
        KelasSd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSd4[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSd4.setVisibility(View.VISIBLE);
                    kelasSd4[0] = false;
                }else {
                    kelasSd4[0] = true;
                }
            }
        });
        KelasSd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSd5[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSd5.setVisibility(View.VISIBLE);
                    kelasSd5[0] = false;
                }else {
                    kelasSd5[0] = true;
                }
            }
        });
        KelasSd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSd6[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSd6.setVisibility(View.VISIBLE);
                    kelasSd6[0] = false;
                }else {

                    kelasSd1[0] = true;
                }
            }
        });



    }
}
