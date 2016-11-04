package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int []aa={R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,
            R.drawable.a8,R.drawable.a9,R.drawable.a10};
    int []mm={R.drawable.m1,R.drawable.m2,R.drawable.m3,R.drawable.m4,R.drawable.m5,R.drawable.m6
    ,R.drawable.m7,R.drawable.m8,R.drawable.m9,R.drawable.m10};

    int []ll={R.drawable.l1,R.drawable.l2,R.drawable.l3,R.drawable.l4,R.drawable.l5,R.drawable.l6,R.drawable.l7,
            R.drawable.l8,R.drawable.l9,R.drawable.l10};
    int []ss={R.drawable.s1,R.drawable.s2,R.drawable.s3,R.drawable.s4,R.drawable.s5,R.drawable.s6,R.drawable.s7,
            R.drawable.s8,R.drawable.s9,R.drawable.s10};
    int []hh={R.drawable.h1,R.drawable.h2,R.drawable.h3,R.drawable.h4,R.drawable.h5,R.drawable.h6,R.drawable.h7,
            R.drawable.h8,R.drawable.h9,R.drawable.h10};


    String[]name_apple={"apple iPhone 6 plus","apple iPhone 6 plus","apple iPhone 6 plus","apple iPhone 6 plus","apple iPhone 6"
            , "apple iPad mini 2","apple iPad Air","apple iPhone 6 ", "apple iPad mini 2","apple iPad Air"};
    String[]body_apple={"Dimensions\n" +
            "158.1 x 77.8 x 7.1 mm (6.22 x 3.06 x 0.28 in)\n" +
            "Weight\n" +
            "172 g (6.07 oz)\n" +
            "SIM\n" +
            "Nano-SIM\n" +
            " \t- Fingerprint sensor (Touch ID)\n" +
            "- Apple Pay (Visa, MasterCard, AMEX certified)\n","Dimensions\n" +
            "158.1 x 77.8 x 7.1 mm (6.22 x 3.06 x 0.28 in)\n" +
            "Weight\n" +
            "172 g (6.07 oz)\n" +
            "SIM\n" +
            "Nano-SIM\n" +
            " \t- Fingerprint sensor (Touch ID)\n" +
            "- Apple Pay (Visa, MasterCard, AMEX certified)\n","Dimensions\n" +
            "138.1 x 67 x 6.9 mm (5.44 x 2.64 x 0.27 in)\n" +
            "Weight\n" +
            "129 g (4.55 oz)\n" +
            "SIM\n" +
            "Nano-SIM\n" +
            " \t- Fingerprint sensor (Touch ID)\n" +
            "- Apple Pay (Visa, MasterCard, AMEX certified)\n","Dimensions\n" +
            "158.1 x 77.8 x 7.1 mm (6.22 x 3.06 x 0.28 in)\n" +
            "Weight\n" +
            "172 g (6.07 oz)\n" +
            "SIM\n" +
            "Nano-SIM\n" +
            " \t- Fingerprint sensor (Touch ID)\n" +
            "- Apple Pay (Visa, MasterCard, AMEX certified)\n","Dimensions\n" +
            "138.1 x 67 x 6.9 mm (5.44 x 2.64 x 0.27 in)\n" +
            "Weight\n" +
            "129 g (4.55 oz)\n" +
            "SIM\n" +
            "Nano-SIM\n" +
            " \t- Fingerprint sensor (Touch ID)\n" +
            "- Apple Pay (Visa, MasterCard, AMEX certified)\n","Dimensions\n" +
            "200 x 134.7 x 7.5 mm (7.87 x 5.30 x 0.30 in)\n" +
            "Weight\n" +
            "331 g (Wi-Fi) / 341 g (3G/LTE) (11.68 oz)\n" +
            "SIM\n" +
            "Nano-SIM\n","Dimensions\n" +
            "240 x 169.5 x 7.5 mm (9.45 x 6.67 x 0.30 in)\n" +
            "Weight\n" +
            "469 g (Wi-Fi) / 478 g (3G/LTE) (1.03 lb)\n" +
            "SIM\n" +
            "Nano-SIM\n","Dimensions\n" +
            "138.1 x 67 x 6.9 mm (5.44 x 2.64 x 0.27 in)\n" +
            "Weight\n" +
            "129 g (4.55 oz)\n" +
            "SIM\n" +
            "Nano-SIM\n" +
            " \t- Fingerprint sensor (Touch ID)\n" +
            "- Apple Pay (Visa, MasterCard, AMEX certified)\n","Dimensions\n" +
            "240 x 169.5 x 7.5 mm (9.45 x 6.67 x 0.30 in)\n" +
            "Weight\n" +
            "469 g (Wi-Fi) / 478 g (3G/LTE) (1.03 lb)\n" +
            "SIM\n" +
            "Nano-SIM\n","Dimensions\n" +
            "200 x 134.7 x 7.5 mm (7.87 x 5.30 x 0.30 in)\n" +
            "Weight\n" +
            "331 g (Wi-Fi) / 341 g (3G/LTE) (11.68 oz)\n" +
            "SIM\n" +
            "Nano-SIM\n"};
    String[]display_apple={"Type\n" +
            "LED-backlit IPS LCD, capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.5 inches (~67.8% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1080 x 1920 pixels (~401 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Ion-strengthened glass, oleophobic coating\n" +
            " \t- Display Zoom\n","Type\n" +
            "LED-backlit IPS LCD, capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.5 inches (~67.8% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1080 x 1920 pixels (~401 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Ion-strengthened glass, oleophobic coating\n" +
            " \t- Display Zoom\n","Type\n" +
            "LED-backlit IPS LCD, capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "4.7 inches (~65.8% screen-to-body ratio)\n" +
            "Resolution\n" +
            "750 x 1334 pixels (~326 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Ion-strengthened glass, oleophobic coating\n" +
            " \t- Display Zoom\n","Type\n" +
            "LED-backlit IPS LCD, capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.5 inches (~67.8% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1080 x 1920 pixels (~401 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Ion-strengthened glass, oleophobic coating\n" +
            " \t- Display Zoom\n","Type\n" +
            "LED-backlit IPS LCD, capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "4.7 inches (~65.8% screen-to-body ratio)\n" +
            "Resolution\n" +
            "750 x 1334 pixels (~326 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Ion-strengthened glass, oleophobic coating\n" +
            " \t- Display Zoom\n","Type\n" +
            "LED-backlit IPS LCD capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "7.9 inches (~71.7% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1536 x 2048 pixels (~324 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Oleophobic coating\n","Type\n" +
            "LED-backlit IPS LCD, capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "9.7 inches (~71.6% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1536 x 2048 pixels (~264 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Scratch-resistant glass, oleophobic coating\n","Type\n" +
            "LED-backlit IPS LCD, capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "4.7 inches (~65.8% screen-to-body ratio)\n" +
            "Resolution\n" +
            "750 x 1334 pixels (~326 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Ion-strengthened glass, oleophobic coating\n" +
            " \t- Display Zoom\n","Type\n" +
            "LED-backlit IPS LCD, capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "9.7 inches (~71.6% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1536 x 2048 pixels (~264 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Scratch-resistant glass, oleophobic coating\n","Type\n" +
            "LED-backlit IPS LCD capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "7.9 inches (~71.7% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1536 x 2048 pixels (~324 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Oleophobic coating\n"};
    String[]memory_apple={"Card slot\n" +
            "No\n" +
            "Internal\n" +
            "16/64/128 GB, 1 GB RAM DDR3\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "16/64/128 GB, 1 GB RAM DDR3\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "16/64/128 GB, 1 GB RAM DDR3\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "16/64/128 GB, 1 GB RAM DDR3\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "16/64/128 GB, 1 GB RAM DDR3\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "16/32/64/128 GB, 1 GB RAM DDR3\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "16/32/64/128 GB, 1 GB RAM DDR3\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "16/64/128 GB, 1 GB RAM DDR3\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "16/32/64/128 GB, 1 GB RAM DDR3\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "16/32/64/128 GB, 1 GB RAM DDR3\n"};
    String[]camera_apple={"Primary\n" +
            "8 MP, 3264 x 2448 pixels, optical image stabilization, phase detection autofocus, dual-LED (dual tone) flash, check quality\n" +
            "Features\n" +
            "1/3'' sensor size, 1.5µm pixel size, geo-tagging, simultaneous HD video and image recording, touch focus, face/smile detection, HDR (photo/panorama)\n" +
            "Video\n" +
            "1080p@60fps, 720p@240fps, optical stabilization, check quality\n" +
            "Secondary\n" +
            "1.2 MP, 720p@30fps, face detection, HDR, FaceTime over Wi-Fi or Cellular\n","Primary\n" +
            "8 MP, 3264 x 2448 pixels, optical image stabilization, phase detection autofocus, dual-LED (dual tone) flash, check quality\n" +
            "Features\n" +
            "1/3'' sensor size, 1.5µm pixel size, geo-tagging, simultaneous HD video and image recording, touch focus, face/smile detection, HDR (photo/panorama)\n" +
            "Video\n" +
            "1080p@60fps, 720p@240fps, optical stabilization, check quality\n" +
            "Secondary\n" +
            "1.2 MP, 720p@30fps, face detection, HDR, FaceTime over Wi-Fi or Cellular\n","Primary\n" +
            "8 MP, 3264 x 2448 pixels, phase detection autofocus, dual-LED (dual tone) flash,check quality\n" +
            "Features\n" +
            "1/3'' sensor size, 1.5µm pixel size, geo-tagging, simultaneous HD video and image recording, touch focus, face/smile detection, HDR (photo/panorama)\n" +
            "Video\n" +
            "1080p@60fps, 720p@240fps, check quality\n" +
            "Secondary\n" +
            "1.2 MP, 720p@30fps, face detection, HDR, FaceTime over Wi-Fi or Cellular\n","Primary\n" +
            "8 MP, 3264 x 2448 pixels, optical image stabilization, phase detection autofocus, dual-LED (dual tone) flash, check quality\n" +
            "Features\n" +
            "1/3'' sensor size, 1.5µm pixel size, geo-tagging, simultaneous HD video and image recording, touch focus, face/smile detection, HDR (photo/panorama)\n" +
            "Video\n" +
            "1080p@60fps, 720p@240fps, optical stabilization, check quality\n" +
            "Secondary\n" +
            "1.2 MP, 720p@30fps, face detection, HDR, FaceTime over Wi-Fi or Cellular\n","Primary\n" +
            "8 MP, 3264 x 2448 pixels, phase detection autofocus, dual-LED (dual tone) flash,check quality\n" +
            "Features\n" +
            "1/3'' sensor size, 1.5µm pixel size, geo-tagging, simultaneous HD video and image recording, touch focus, face/smile detection, HDR (photo/panorama)\n" +
            "Video\n" +
            "1080p@60fps, 720p@240fps, check quality\n" +
            "Secondary\n" +
            "1.2 MP, 720p@30fps, face detection, HDR, FaceTime over Wi-Fi or Cellular\n","Primary\n" +
            "5 MP, 2592 х 1944 pixels, autofocus, check quality\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face/smile detection, HDR photo\n" +
            "Video\n" +
            "1080p@30fps, check quality\n" +
            "Secondary\n" +
            "1.2 MP, 720p@30fps, face detection, FaceTime over Wi-Fi or Cellular\n","Primary\n" +
            "5 MP, 2592 x 1944 pixels, autofocus, check quality\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face/smile detection, HDR (photo/panorama)\n" +
            "Video\n" +
            "1080p@30fps, check quality\n" +
            "Secondary\n" +
            "1.2 MP, 720p@30fps, face detection, FaceTime over Wi-Fi or Cellular\n","Primary\n" +
            "8 MP, 3264 x 2448 pixels, phase detection autofocus, dual-LED (dual tone) flash,check quality\n" +
            "Features\n" +
            "1/3'' sensor size, 1.5µm pixel size, geo-tagging, simultaneous HD video and image recording, touch focus, face/smile detection, HDR (photo/panorama)\n" +
            "Video\n" +
            "1080p@60fps, 720p@240fps, check quality\n" +
            "Secondary\n" +
            "1.2 MP, 720p@30fps, face detection, HDR, FaceTime over Wi-Fi or Cellular\n","Primary\n" +
            "5 MP, 2592 x 1944 pixels, autofocus, check quality\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face/smile detection, HDR (photo/panorama)\n" +
            "Video\n" +
            "1080p@30fps, check quality\n" +
            "Secondary\n" +
            "1.2 MP, 720p@30fps, face detection, FaceTime over Wi-Fi or Cellular\n","Primary\n" +
            "5 MP, 2592 х 1944 pixels, autofocus, check quality\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face/smile detection, HDR photo\n" +
            "Video\n" +
            "1080p@30fps, check quality\n" +
            "Secondary\n" +
            "1.2 MP, 720p@30fps, face detection, FaceTime over Wi-Fi or Cellular\n"};
    String[]price_apple={"2200$","2350$","2000$","3000$","1700$","2300$","2100$","2000$","3200$","2200$"};
    // microsoft
    String[]name_micro={"Microsoft Lumia 640 XL","Microsoft Lumia 540 Dual SIM","Microsoft Lumia 535 Dual SIM","Microsoft Lumia 532 "
    ,"Microsoft Lumia 435 Dual SIM","Microsoft Lumia 430 Dual SIM","Microsoft Lumia 920","Microsoft Lumia 820","Microsoft Lumia 630"
    ,"Microsoft Lumia 720"};
    String[]body_micro={"Dimensions\n" +
            "157.9 x 81.5 x 9 mm (6.22 x 3.21 x 0.35 in)\n" +
            "Weight\n" +
            "171 g (6.03 oz)\n" +
            "SIM\n" +
            "Micro-SIM\n","Dimensions\n" +
            "144 x 73.7 x 8.6 mm (5.67 x 2.90 x 0.34 in)\n" +
            "Weight\n" +
            "152 g (5.36 oz)\n" +
            "SIM\n" +
            "Dual SIM (Micro-SIM, dual stand-by)\n","Dimensions\n" +
            "140.2 x 72.4 x 8.8 mm (5.52 x 2.85 x 0.35 in)\n" +
            "Weight\n" +
            "146 g (5.15 oz)\n" +
            "SIM\n" +
            "Dual SIM (Micro-SIM, dual stand-by)\n","Dimensions\n" +
            "118.9 x 65.5 x 11.6 mm (4.68 x 2.58 x 0.46 in)\n" +
            "Weight\n" +
            "136.3 g (4.80 oz)\n" +
            "SIM\n" +
            "Micro-SIM\n","Dimensions\n" +
            "118.1 x 64.7 x 11.7 mm (4.65 x 2.55 x 0.46 in)\n" +
            "Weight\n" +
            "134.1 g (4.73 oz)\n" +
            "SIM\n" +
            "Dual SIM (Micro-SIM, dual stand-by)\n","Dimensions\n" +
            "120.5 x 63.2 x 10.6 mm (4.74 x 2.49 x 0.42 in)\n" +
            "Weight\n" +
            "127.9 g (4.52 oz)\n" +
            "SIM\n" +
            "Dual SIM (Micro-SIM, dual stand-by)\n","Dimensions\n" +
            "130.3 x 70.8 x 10.7 mm, 99 cc (5.13 x 2.79 x 0.42 in)\n" +
            "Weight\n" +
            "185 g (6.53 oz)\n" +
            "SIM\n" +
            "Micro-SIM\n","Dimensions\n" +
            "123.8 x 68.5 x 9.9 mm, 83.5 cc (4.87 x 2.70 x 0.39 in)\n" +
            "Weight\n" +
            "160 g (5.64 oz)\n" +
            "SIM\n" +
            "Micro-SIM\n","Dimensions\n" +
            "129.5 x 66.7 x 9.2 mm, 78.5 cc (5.10 x 2.63 x 0.36 in)\n" +
            "Weight\n" +
            "134 g (4.73 oz)\n" +
            "SIM\n" +
            "Micro-SIM\n","Dimensions\n" +
            "141.4 x 77.7 x 10.9 mm, 109 cc (5.57 x 3.06 x 0.43 in)\n" +
            "Weight\n" +
            "190 g (6.70 oz)\n" +
            "SIM\n" +
            "Optional Dual SIM (Micro-SIM)\n"};

    String[]display_micro={"Type\n" +
            "IPS LCD capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.7 inches (~69.1% screen-to-body ratio)\n" +
            "Resolution\n" +
            "720 x 1280 pixels (~259 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 3\n" +
            " \t- ClearBlack display\n","Type\n" +
            "IPS LCD capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.0 inches (~64.9% screen-to-body ratio)\n" +
            "Resolution\n" +
            "720 x 1280 pixels (~294 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            " \t- ClearBlack display\n","Type\n" +
            "IPS LCD capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.0 inches (~67.9% screen-to-body ratio)\n" +
            "Resolution\n" +
            "540 x 960 pixels (~220 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 3\n","Type\n" +
            "Capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "4.0 inches (~58.5% screen-to-body ratio)\n" +
            "Resolution\n" +
            "480 x 800 pixels (~233 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n","Type\n" +
            "Capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "4.0 inches (~59.6% screen-to-body ratio)\n" +
            "Resolution\n" +
            "480 x 800 pixels (~233 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n","Type\n" +
            "Capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "4.0 inches (~58.8% screen-to-body ratio)\n" +
            "Resolution\n" +
            "480 x 800 pixels (~235 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n","Type\n" +
            "IPS LCD capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "4.5 inches (~62.5% screen-to-body ratio)\n" +
            "Resolution\n" +
            "768 x 1280 pixels (~332 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 2\n" +
            " \t- PureMotion HD+ ClearBlack display\n","Type\n" +
            "AMOLED capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "4.3 inches (~62.1% screen-to-body ratio)\n" +
            "Resolution\n" +
            "480 x 800 pixels (~217 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            " \t- Nokia ClearBlack display\n","Type\n" +
            "IPS LCD capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "4.5 inches (~62.9% screen-to-body ratio)\n" +
            "Resolution\n" +
            "480 x 854 pixels (~221 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 3\n" +
            " \t- ClearBlack display\n","Type\n" +
            "IPS LCD capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.0 inches (~64.8% screen-to-body ratio)\n" +
            "Resolution\n" +
            "480 x 800 pixels (~187 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            " \t- Nokia X platform 1.0 UI\n"};
    String[]memory_micro={"Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "8 GB, 1 GB RAM\n","Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "8 GB, 1 GB RAM\n","Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "8 GB, 1 GB RAM\n","Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "8 GB, 1 GB RAM\n","Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "8 GB, 1 GB RAM\n","Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "8 GB, 1 GB RAM\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "32 GB, 1 GB RAM\n","Card slot\n" +
            "microSD, up to 64 GB\n" +
            "Internal\n" +
            "8 GB, 1 GB RAM\n","Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "8 GB, 512 MB RAM\n","Card slot\n" +
            "microSD, up to 32 GB\n" +
            "Internal\n" +
            "4 GB, 768 MB RAM\n"};
    String[]camera_micro={"Primary\n" +
            "13 MP, 4128 x 3096 pixels, Carl Zeiss optics, autofocus, LED flash\n" +
            "Features\n" +
            "1/3'' sensor size\n" +
            "Video\n" +
            "1080p@30fps\n" +
            "Secondary\n" +
            "5 MP, 1080p\n","Primary\n" +
            "8 MP, 3264 x 2448 pixels, autofocus, LED flash\n" +
            "Features\n" +
            "1/4'' sensor size, geo-tagging\n" +
            "Video\n" +
            "480p@30fps\n" +
            "Secondary\n" +
            "5 MP, 480p\n","Primary\n" +
            "5 MP, 2592 x 1936 pixels, autofocus, LED flash, check quality\n" +
            "Features\n" +
            "1/4'' sensor size, geo-tagging\n" +
            "Video\n" +
            "480p@30fps\n" +
            "Secondary\n" +
            "5 MP\n","Primary\n" +
            "5 MP, 2592 х 1944 pixels\n" +
            "Features\n" +
            "Geo-tagging\n" +
            "Video\n" +
            "480p@30fps\n" +
            "Secondary\n" +
            "VGA, 480p\n","Primary\n" +
            "2 MP, 1600 x 1200 pixels\n" +
            "Features\n" +
            "Geo-tagging\n" +
            "Video\n" +
            "480p@30fps\n" +
            "Secondary\n" +
            "VGA, 480p\n","Primary\n" +
            "2 MP, 1600 x 1200 pixels\n" +
            "Features\n" +
            "1/5'' sensor size\n" +
            "Video\n" +
            "480p@30fps\n" +
            "Secondary\n" +
            "VGA, 480p\n","Primary\n" +
            "8 MP, 3264 x 2448 pixels, Carl Zeiss optics, optical image stabilization, autofocus, dual-LED flash, check quality\n" +
            "Features\n" +
            "PureView technology, geo-tagging, touch focus\n" +
            "Video\n" +
            "1080p@30fps, optical stabilization, check quality\n" +
            "Secondary\n" +
            "1.3 MP, 720p@30fps\n","Primary\n" +
            "8 MP, 3264 x 2448 pixels, Carl Zeiss optics, autofocus, dual-LED flash, check quality\n" +
            "Features\n" +
            "Geo-tagging, touch focus\n" +
            "Video\n" +
            "1080p@30fps, check quality\n" +
            "Secondary\n" +
            "VGA\n","Primary\n" +
            "5 MP, 2592 х 1944 pixels, autofocus, check quality\n" +
            "Features\n" +
            "1/4'' sensor size, geo-tagging, panorama\n" +
            "Video\n" +
            "720p@30fps, check quality\n" +
            "Secondary\n" +
            "No\n","Primary\n" +
            "5 MP, 2592 х 1944 pixels, autofocus, LED flash, check quality\n" +
            "Features\n" +
            "1/4'' sensor size, panorama, face detection\n" +
            "Video\n" +
            "480p@30fps\n" +
            "Secondary\n" +
            "2 MP\n"};
    String[]price_micro={"1200$","1350$","1000$","2000$","700$","1300$","1500$","1200$","2200$","1200$"};
    String[]name_len={"Lenovo Vibe Z2","Lenovo IdealTab S6000H","Lenovo Vibe Z2","Lenovo S90 Sisely","Lenovo Vibe X2","Lenovo P70"
    ,"Lenovo S860","Lenovo S850","Lenovo S60","Lenovo A7000","Lenovo S580"};
    String[]body_len={"Dimensions\n" +
            "148.5 x 76.4 x 7.8 mm (5.85 x 3.01 x 0.31 in)\n" +
            "Weight\n" +
            "158 g (5.57 oz)\n" +
            "SIM\n" +
            "Dual SIM (Micro-SIM, dual stand-by)\n","Dimensions\n" +
            "260 x 180 x 8.6 mm (10.24 x 7.09 x 0.34 in)\n" +
            "Weight\n" +
            "560 g (1.23 lb)\n" +
            "SIM\n" +
            "Yes\n","Dimensions\n" +
            "146 x 71.7 x 6.9 mm (5.75 x 2.82 x 0.27 in)\n" +
            "Weight\n" +
            "129 g (4.55 oz)\n" +
            "SIM\n" +
            "Dual SIM (Micro-SIM, dual stand-by)\n","Dimensions\n" +
            "140.2 x 68.6 x 7.3 mm (5.52 x 2.70 x 0.29 in)\n" +
            "Weight\n" +
            "120 g (4.23 oz)\n" +
            "SIM\n" +
            "Micro-SIM - Single SIM model\n" +
            "Dual SIM (Micro-SIM/Nano-SIM, dual stand-by)\n","Dimensions\n" +
            "142 x 71.8 x 8.9 mm (5.59 x 2.83 x 0.35 in)\n" +
            "Weight\n" +
            "149 g (5.26 oz)\n" +
            "SIM\n" +
            "Dual SIM (Micro-SIM, dual stand-by)\n","Dimensions\n" +
            "149.5 x 77 x 10.3 mm (5.89 x 3.03 x 0.41 in)\n" +
            "Weight\n" +
            "190 g (6.70 oz)\n" +
            "SIM\n" +
            "Dual SIM (Micro-SIM)\n","Dimensions\n" +
            "141 x 71 x 8.2 mm (5.55 x 2.80 x 0.32 in)\n" +
            "Weight\n" +
            "140 g (4.94 oz)\n" +
            "SIM\n" +
            "Dual SIM (Micro-SIM)\n","Dimensions\n" +
            "143.3 x 72 x 7.7 mm (5.64 x 2.83 x 0.30 in)\n" +
            "Weight\n" +
            "128 g (4.52 oz)\n" +
            "SIM\n" +
            "Dual SIM (Micro-SIM/Nano-SIM, dual stand-by)\n","Dimensions\n" +
            "152.6 x 76.2 x 8 mm (6.01 x 3.00 x 0.31 in)\n" +
            "Weight\n" +
            "140 g (4.94 oz)\n" +
            "SIM\n" +
            "Dual SIM (Micro-SIM, dual stand-by)\n","Dimensions\n" +
            "139.8 x 69.9 x 8.1 mm (5.50 x 2.75 x 0.32 in)\n" +
            "Weight\n" +
            "129 g (4.55 oz)\n" +
            "SIM\n" +
            "Dual SIM (Mini-SIM, dual stand-by)\n"};
    String[]display_len={"Type\n" +
            "IPS LCD capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.5 inches (~73.5% screen-to-body ratio)\n" +
            "Resolution\n" +
            "720 x 1280 pixels (~267 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n","Type\n" +
            "IPS LCD capacitive touchscreen\n" +
            "Size\n" +
            "10.1 inches (~63.2% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1280 x 800 pixels (~149 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes, up to 10 fingers\n","Type\n" +
            "Super AMOLED capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.0 inches (~65.8% screen-to-body ratio)\n" +
            "Resolution\n" +
            "720 x 1280 pixels (~294 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n","Type\n" +
            "IPS LCD capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.0 inches (~71.7% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1080 x 1920 pixels (~441 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes, up to 5 fingers\n","Type\n" +
            "IPS LCD capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.0 inches (~67.6% screen-to-body ratio)\n" +
            "Resolution\n" +
            "720 x 1280 pixels (~294 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes, up to 5 fingers\n","Type\n" +
            "IPS LCD capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.3 inches (~67.3% screen-to-body ratio)\n" +
            "Resolution\n" +
            "720 x 1280 pixels (~277 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes, up to 5 fingers\n","Type\n" +
            "Capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.0 inches (~68.8% screen-to-body ratio)\n" +
            "Resolution\n" +
            "720 x 1280 pixels (~294 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes, up to 5 fingers\n","Type\n" +
            "IPS capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.0 inches (~66.8% screen-to-body ratio)\n" +
            "Resolution\n" +
            "720 x 1280 pixels (~294 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes, up to 5 fingers\n" +
            " \t- Lenovo Vibe 2.0\n","Type\n" +
            "IPS capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.5 inches (~71.7% screen-to-body ratio)\n" +
            "Resolution\n" +
            "720 x 1280 pixels (~267 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            " \t- Lenovo Vibe\n","Type\n" +
            "IPS LCD capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.0 inches (~70.5% screen-to-body ratio)\n" +
            "Resolution\n" +
            "720 x 1280 pixels (~294 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n"};
    String[]memory_len={"Card slot\n" +
            "No\n" +
            "Internal\n" +
            "32 GB, 2 GB RAM\n","Card slot\n" +
            "microSD, up to 64 GB\n" +
            "Internal\n" +
            "32 GB, 1 GB RAM\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "16/32 GB, 1/2 GB RAM\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "32 GB, 2 GB RAM\n","Card slot\n" +
            "microSD, up to 32 GB\n" +
            "Internal\n" +
            "16 GB, 2 GB RAM\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "16 GB, 2 GB RAM\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "16 GB, 1 GB RAM\n","Card slot\n" +
            "microSD, up to 32 GB\n" +
            "Internal\n" +
            "8 GB, 2 GB RAM\n","Card slot\n" +
            "microSD, up to 32 GB\n" +
            "Internal\n" +
            "8 GB, 2 GB RAM\n","Card slot\n" +
            "microSD, up to 32 GB\n" +
            "Internal\n" +
            "8 GB, 1 GB RAM\n"};
    String[]camera_len={"Primary\n" +
            "13 MP, 4160 x 3120 pixels, optical image stabilization, autofocus, LED flash\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection, panorama, HDR\n" +
            "Video\n" +
            "1080p@30fps\n" +
            "Secondary\n" +
            "8MP\n","Primary\n" +
            "5 MP, 2592 x 1936 pixels, autofocus\n" +
            "Video\n" +
            "Yes\n" +
            "Secondary\n" +
            "VGA\n","Primary\n" +
            "13 MP, 4208 x 3120 pixels, autofocus, LED flash, check quality\n" +
            "Features\n" +
            "1/3.2'' sensor size, 1.4µm pixel size, geo-tagging, touch focus, face detection, HDR\n" +
            "Video\n" +
            "1080p@30fps, check quality\n" +
            "Secondary\n" +
            "8 MP, autofocus, LED flash\n","Primary\n" +
            "13 MP, 4160 x 3120 pixels, autofocus, LED flash, check quality\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection, panorama, HDR\n" +
            "Video\n" +
            "1080p@30fps, check quality\n" +
            "Secondary\n" +
            "5 MP\n","Primary\n" +
            "13 MP, 4160 x 3120 pixels, autofocus, LED flash\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection, panorama\n" +
            "Video\n" +
            "1080p@30fps\n" +
            "Secondary\n" +
            "5 MP\n","Primary\n" +
            "8 MP, 3264 x 2448 pixels, autofocus, LED flash\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection, HDR\n" +
            "Video\n" +
            "Yes\n" +
            "Secondary\n" +
            "1.6 MP\n","Primary\n" +
            "13 MP, 4128 x 3096 pixels, autofocus, LED flash\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection, HDR\n" +
            "Video\n" +
            "Yes\n" +
            "Secondary\n" +
            "5 MP\n","Primary\n" +
            "13 MP, 4128 x 3096 pixels, autofocus, LED flash\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection\n" +
            "Video\n" +
            "Yes\n" +
            "Secondary\n" +
            "5 MP\n","Primary\n" +
            "8 MP, 3264 x 2448 pixels, autofocus, LED flash\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection\n" +
            "Video\n" +
            "Yes\n" +
            "Secondary\n" +
            "5 MP\n","Primary\n" +
            "8 MP, 3264 x 2448 pixels, autofocus, LED flash\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection\n" +
            "Video\n" +
            "Yes\n" +
            "Secondary\n" +
            "2 MP\n"};
    String[]price_len={"2200$","2350$","2000$","3000$","1700$","2300$","2100$","2000$","3200$","2200$"};
    String[]name_sam={"Samsung Galaxy S6 edge+","Samsung Galaxy Note 5","Samsung Galaxy S6 edge"
    ,"Samsung Galaxy Note 4","Samsung Galaxy Note edge","Samsung Galaxy S6 ","Samsung Galaxy Note 3","Samsung Galaxy Note 3",
            "Samsung Galaxy A7","Samsung Galaxy Tab A 9.7",};
    String[]body_sam={"Dimensions\n" +
            "154.4 x 75.8 x 6.9 mm (6.08 x 2.98 x 0.27 in)\n" +
            "Weight\n" +
            "153 g (5.40 oz)\n" +
            "Build\n" +
            "Corning Gorilla Glass 4 back panel\n" +
            "SIM\n" +
            "Nano-SIM\n" +
            " \t- Fingerprint sensor (PayPal certified)\n" +
            "- Samsung Pay (Visa, MasterCard certified)\n","Dimensions\n" +
            "153.2 x 76.1 x 7.6 mm (6.03 x 3.00 x 0.30 in)\n" +
            "Weight\n" +
            "171 g (6.03 oz)\n" +
            "SIM\n" +
            "Nano-SIM\n" +
            " \t- Fingerprint sensor (PayPal certified)\n" +
            "- S Pen stylus\n","Dimensions\n" +
            "142.1 x 70.1 x 7 mm (5.59 x 2.76 x 0.28 in)\n" +
            "Weight\n" +
            "132 g (4.66 oz)\n" +
            "Build\n" +
            "Corning Gorilla Glass 4 back panel\n" +
            "SIM\n" +
            "Nano-SIM\n" +
            " \t- Fingerprint sensor (PayPal certified)\n" +
            "- Samsung Pay (Visa, MasterCard certified)\n","Dimensions\n" +
            "153.5 x 78.6 x 8.5 mm (6.04 x 3.09 x 0.33 in)\n" +
            "Weight\n" +
            "176 g (6.21 oz)\n" +
            "SIM\n" +
            "Micro-SIM\n" +
            " \t- Fingerprint sensor (PayPal certified)\n" +
            "- S Pen stylus\n","Dimensions\n" +
            "151.3 x 82.4 x 8.3 mm (5.96 x 3.24 x 0.33 in)\n" +
            "Weight\n" +
            "174 g (6.14 oz)\n" +
            "SIM\n" +
            "Micro-SIM\n" +
            " \t- Fingerprint sensor\n" +
            "- S Pen stylus\n","Dimensions\n" +
            "143.4 x 70.5 x 6.8 mm (5.65 x 2.78 x 0.27 in)\n" +
            "Weight\n" +
            "138 g (4.87 oz)\n" +
            "Build\n" +
            "Corning Gorilla Glass 4 back panel\n" +
            "SIM\n" +
            "Nano-SIM\n" +
            " \t- Fingerprint sensor (PayPal certified)\n" +
            "- Samsung Pay (Visa, MasterCard certified)\n","Dimensions\n" +
            "151.2 x 79.2 x 8.3 mm (5.95 x 3.12 x 0.33 in)\n" +
            "Weight\n" +
            "168 g (5.93 oz)\n" +
            "SIM\n" +
            "Micro-SIM\n" +
            " \t- S Pen stylus\n","Dimensions\n" +
            "151.2 x 79.2 x 8.3 mm (5.95 x 3.12 x 0.33 in)\n" +
            "Weight\n" +
            "168 g (5.93 oz)\n" +
            "SIM\n" +
            "Micro-SIM\n" +
            " \t- S Pen stylus\n","Dimensions\n" +
            "151 x 76.2 x 6.3 mm (5.94 x 3.00 x 0.25 in)\n" +
            "Weight\n" +
            "141 g (4.97 oz)\n" +
            "SIM\n" +
            "Nano-SIM\n","Dimensions\n" +
            "242.5 x 166.8 x 7.5 mm (9.55 x 6.57 x 0.30 in)\n" +
            "Weight\n" +
            "450 g (Wi-Fi), 453 g (LTE) (1.00 lb)\n" +
            "SIM\n" +
            "Micro-SIM\n"};
    String[]display_sam={"Type\n" +
            "Super AMOLED capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.7 inches (~75.6% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1440 x 2560 pixels (~518 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 4\n" +
            " \t- TouchWiz UI\n" +
            "- Curved edge screen\n","Type\n" +
            "Super AMOLED capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.7 inches (~75.9% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1440 x 2560 pixels (~518 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 4\n","Type\n" +
            "Super AMOLED capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.1 inches (~71.7% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1440 x 2560 pixels (~577 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 4\n" +
            " \t- TouchWiz UI\n" +
            "- Curved edge screen\n","Type\n" +
            "Super AMOLED capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.7 inches (~74.2% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1440 x 2560 pixels (~515 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 4\n","Type\n" +
            "Super AMOLED capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.6 inches (~77.2% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1600 x 2560 pixels (~524 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 3\n" +
            " \t- Curved edge screen\n","Type\n" +
            "Super AMOLED capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.1 inches (~70.7% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1440 x 2560 pixels (~577 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 4\n" +
            " \t- TouchWiz UI\n","Type\n" +
            "Super AMOLED capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.7 inches (~74.8% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1080 x 1920 pixels (~386 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 3\n","Type\n" +
            "Super AMOLED capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.7 inches (~74.8% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1080 x 1920 pixels (~386 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 3\n","Type\n" +
            "Super AMOLED capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.5 inches (~72.5% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1080 x 1920 pixels (~401 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 4\n","Type\n" +
            "TFT capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "9.7 inches (~72.0% screen-to-body ratio)\n" +
            "Resolution\n" +
            "768 x 1024 pixels (~132 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n"};
    String[]memory_sam={"Card slot\n" +
            "No\n" +
            "Internal\n" +
            "32/64/128 GB, 4 GB RAM\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "32/64/128 GB, 4 GB RAM\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "32/64/128 GB, 3 GB RAM\n","Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "32 GB, 3 GB RAM\n","Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "32/64 GB, 3 GB RAM\n","Card slot\n" +
            "microSD, up to 64 GB\n" +
            "Internal\n" +
            "16/32/64 GB, 3 GB RAM\n","Card slot\n" +
            "microSD, up to 64 GB\n" +
            "Internal\n" +
            "16/32/64 GB, 3 GB RAM\n","Card slot\n" +
            "microSD, up to 64 GB\n" +
            "Internal\n" +
            "16 GB, 2 GB RAM\n","Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "16 GB, 1.5 GB RAM (Wi-Fi)\n" +
            "16/32 GB, 2 GB RAM (LTE)\n"};
    String[]camera_sam={"Primary\n" +
            "16 MP, 2988 x 5312 pixels, optical image stabilization, autofocus, LED flash\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection, Auto HDR, panorama\n" +
            "Video\n" +
            "2160p@30fps, 1080p@60fps, 720p@120fps, HDR, dual-video rec.\n" +
            "Secondary\n" +
            "5 MP, 1440p@30fps, dual video call, Auto HDR\n","Primary\n" +
            "16 MP, 5312 x 2988 pixels, optical image stabilization, autofocus, LED flash\n" +
            "Features\n" +
            "Dual Shot, Simultaneous HD video and image recording, geo-tagging, touch focus, face/smile detection, panorama, HDR\n" +
            "Video\n" +
            "2160p@30fps, 1080p@60fps, optical stabilization, dual-video rec.\n" +
            "Secondary\n" +
            "5 MP\n","Primary\n" +
            "16 MP, 2988 x 5312 pixels, optical image stabilization, autofocus, LED flash,check quality\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection, Auto HDR, panorama\n" +
            "Video\n" +
            "2160p@30fps, 1080p@60fps, 720p@120fps, HDR, dual-video rec., check quality\n" +
            "Secondary\n" +
            "5 MP, 1440p@30fps, dual video call, Auto HDR\n","Primary\n" +
            "16 MP, 5312 x 2988 pixels, optical image stabilization, autofocus, LED flash,check quality\n" +
            "Features\n" +
            "Dual Shot, Simultaneous HD video and image recording, geo-tagging, touch focus, face/smile detection, panorama, HDR\n" +
            "Video\n" +
            "2160p@30fps, 1080p@60fps, optical stabilization, dual-video rec., check quality\n" +
            "Secondary\n" +
            "3.7 MP, 1440p\n","Primary\n" +
            "16 MP, 5312 x 2988 pixels, optical image stabilization, autofocus, LED flash,check quality\n" +
            "Features\n" +
            "Dual Shot, Simultaneous HD video and image recording, geo-tagging, touch focus, face/smile detection, panorama, HDR\n" +
            "Video\n" +
            "2160p@30fps, 1080p@60fps, 720p@120fps, optical stabilization, dual-video rec.,check quality\n" +
            "Secondary\n" +
            "3.7 MP, 1440p@30fps\n","Primary\n" +
            "16 MP, 2988 x 5312 pixels, optical image stabilization, autofocus, LED flash,check quality\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection, Auto HDR, panorama\n" +
            "Video\n" +
            "2160p@30fps, 1080p@60fps, 720p@120fps, HDR, dual-video rec., check quality\n" +
            "Secondary\n" +
            "5 MP, 1440p@30fps, dual video call, Auto HDR\n","Primary\n" +
            "13 MP, 4128 x 3096 pixels, autofocus, LED flash, check quality\n" +
            "Features\n" +
            "Dual Shot, Simultaneous HD video and image recording, geo-tagging, touch focus, face/smile detection, panorama, HDR\n" +
            "Video\n" +
            "2160p@30fps, 1080p@60fps (N9005, N9002)/ 1080p (N9000), check quality\n" +
            "Secondary\n" +
            "2 MP, 1080p@30fps\n","Primary\n" +
            "13 MP, 4128 x 3096 pixels, autofocus, LED flash, check quality\n" +
            "Features\n" +
            "Dual Shot, Simultaneous HD video and image recording, geo-tagging, touch focus, face/smile detection, panorama, HDR\n" +
            "Video\n" +
            "2160p@30fps, 1080p@60fps (N9005, N9002)/ 1080p (N9000), check quality\n" +
            "Secondary\n" +
            "2 MP, 1080p@30fps\n","Primary\n" +
            "13 MP, 4128 x 3096 pixels, autofocus, LED flash, check quality\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection, panorama, HDR\n" +
            "Video\n" +
            "1080p@30fps, check quality\n" +
            "Secondary\n" +
            "5 MP, 1080p\n","Primary\n" +
            "5 MP, 2592 х 1944 pixels, autofocus\n" +
            "Features\n" +
            "Geo-tagging\n" +
            "Video\n" +
            "720p@30fps\n" +
            "Secondary\n" +
            "2 MP\n"};
    String[]price_sam={"1800$","1650$","1500$","2000$","1000$","1800$","1500$","1500$","2000$","1900$"};
    String[]name_htc={"HTC One M9","HTC One E9 +","HTC Desire Eye","HTC One M9 Dual sim","HTC One E8","HTC One E8","HTC Desire 820",
            "HTC One ","HTC Desire 816G dual sim","HTC Desire 626G+"};
    String[]body_htc={"Dimensions\n" +
            "144.6 x 69.7 x 9.6 mm (5.69 x 2.74 x 0.38 in)\n" +
            "Weight\n" +
            "157 g (5.54 oz)\n" +
            "SIM\n" +
            "Nano-SIM\n","Dimensions\n" +
            "156.5 x 76.5 x 7.5 mm (6.16 x 3.01 x 0.30 in)\n" +
            "Weight\n" +
            "150 g (5.29 oz)\n" +
            "SIM\n" +
            "Dual SIM (Nano-SIM, dual stand-by)\n","Dimensions\n" +
            "151.7 x 73.8 x 8.5 mm (5.97 x 2.91 x 0.33 in)\n" +
            "Weight\n" +
            "154 g (5.43 oz)\n" +
            "SIM\n" +
            "Nano-SIM\n" +
            " \tIPX7 certified - dust proof and water resistant up to 1 meter and 30 minutes\n","Dimensions\n" +
            "146.4 x 70.6 x 9.4 mm (5.76 x 2.78 x 0.37 in)\n" +
            "Weight\n" +
            "160 g (5.64 oz)\n" +
            "SIM\n" +
            "Dual SIM (Nano-SIM, dual stand-by)\n","Dimensions\n" +
            "146.4 x 70.7 x 9.9 mm (5.76 x 2.78 x 0.39 in)\n" +
            "Weight\n" +
            "145 g (5.11 oz)\n" +
            "SIM\n" +
            "Optional Dual SIM (Nano-SIM, dual stand-by)\n","Dimensions\n" +
            "146.4 x 70.7 x 9.9 mm (5.76 x 2.78 x 0.39 in)\n" +
            "Weight\n" +
            "145 g (5.11 oz)\n" +
            "SIM\n" +
            "Optional Dual SIM (Nano-SIM, dual stand-by)\n","Dimensions\n" +
            "157.7 x 78.7 x 7.7 mm (6.21 x 3.10 x 0.30 in)\n" +
            "Weight\n" +
            "155 g (5.47 oz)\n" +
            "SIM\n" +
            "Nano-SIM\n","Dimensions\n" +
            "137.4 x 68.2 x 9.3 mm (5.41 x 2.69 x 0.37 in)\n" +
            "Weight\n" +
            "143 g (5.04 oz)\n" +
            "SIM\n" +
            "Micro-SIM\n","Dimensions\n" +
            "156.6 x 78.7 x 8 mm (6.17 x 3.10 x 0.31 in)\n" +
            "Weight\n" +
            "158 g (5.57 oz)\n" +
            "SIM\n" +
            "Dual SIM (Nano-SIM, dual stand-by)\n","Dimensions\n" +
            "146.9 x 70.9 x 8.2 mm (5.78 x 2.79 x 0.32 in)\n" +
            "Weight\n" +
            "138 g (4.87 oz)\n" +
            "SIM\n" +
            "Dual SIM (Nano-SIM, dual stand-by)\n"};
    String[]display_htc={"Type\n" +
            "Super LCD3 capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.0 inches (~68.4% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1080 x 1920 pixels (~441 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 4\n" +
            " \t- HTC Sense UI 7.0\n","Type\n" +
            "Capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.5 inches (~69.7% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1440 x 2560 pixels (~534 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 4\n" +
            " \t- HTC Sense UI 7.0\n","Type\n" +
            "Capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.2 inches (~66.6% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1080 x 1920 pixels (~424 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 3\n" +
            " \t- HTC Sense UI 6.0\n","Type\n" +
            "Super LCD3 capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.0 inches (~66.7% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1080 x 1920 pixels (~441 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 3\n" +
            " \t- HTC Sense UI 6.0\n","Type\n" +
            "Super LCD3 capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.0 inches (~66.6% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1080 x 1920 pixels (~441 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 3\n" +
            " \t- HTC Sense UI 6.0\n","Type\n" +
            "Super LCD3 capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.0 inches (~66.6% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1080 x 1920 pixels (~441 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 3\n" +
            " \t- HTC Sense UI 6.0\n","Type\n" +
            "LCD capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.5 inches (~67.2% screen-to-body ratio)\n" +
            "Resolution\n" +
            "720 x 1280 pixels (~267 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 3\n" +
            " \t- HTC Sense UI 6.0\n","Type\n" +
            "Super LCD3 capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "4.7 inches (~65.0% screen-to-body ratio)\n" +
            "Resolution\n" +
            "1080 x 1920 pixels (~469 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            "Protection\n" +
            "Corning Gorilla Glass 2\n" +
            " \t- HTC Sense UI 5.0\n","Type\n" +
            "Capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.5 inches (~67.7% screen-to-body ratio)\n" +
            "Resolution\n" +
            "720 x 1280 pixels (~267 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n" +
            " \t- HTC Sense UI 6.0\n","Type\n" +
            "Capacitive touchscreen, 16M colors\n" +
            "Size\n" +
            "5.0 inches (~66.2% screen-to-body ratio)\n" +
            "Resolution\n" +
            "720 x 1280 pixels (~294 ppi pixel density)\n" +
            "Multitouch\n" +
            "Yes\n"};
    String[]memory_htc={"Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "32 GB, 3 GB RAM\n","Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "32 GB, 3 GB RAM\n","Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "16 GB, 2 GB RAM\n","Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "16 GB, 2 GB RAM\n","Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "16 GB, 2 GB RAM\n","Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "16 GB, 2 GB RAM\n","Card slot\n" +
            "microSD, up to 128 GB\n" +
            "Internal\n" +
            "16 GB, 2 GB RAM\n","Card slot\n" +
            "No\n" +
            "Internal\n" +
            "32/64 GB, 2 GB RAM\n","Card slot\n" +
            "microSD, up to 32 GB\n" +
            "Internal\n" +
            "8 GB (Quad core version), 16 GB (Octa core version), 1 GB RAM\n","Card slot\n" +
            "microSD, up to 32 GB\n" +
            "Internal\n" +
            "8 GB, 1 GB RAM\n"};
    String[]camera_htc={"Primary\n" +
            "20 MP, 5376 x 3752 pixels, autofocus, dual-LED (dual tone) flash, check quality\n" +
            "Features\n" +
            "Automatic simultaneous video and image recording, geo-tagging, face/smile detection, HDR, panorama\n" +
            "Video\n" +
            "2160p@30fps, 1080p@60fps, 720p@120fps, HDR, stereo sound rec., check quality\n" +
            "Secondary\n" +
            "4 MP, 1080p@30fps, HDR\n","Primary\n" +
            "20 MP, 5376 x 3744 pixels, autofocus, LED flash, check quality\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection, panorama, HDR\n" +
            "Video\n" +
            "2160p@30fps, check quality\n" +
            "Secondary\n" +
            "13 MP or 4 MP (market/region dependent)\n","Primary\n" +
            "13 MP, 4208 x 3120 pixels, autofocus, dual-LED (dual tone) flash, check quality\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection, panorama, HDR\n" +
            "Video\n" +
            "1080p@30fps, check quality\n" +
            "Secondary\n" +
            "13 MP, autofocus, dual-LED (dual tone) flash, HDR\n","Primary\n" +
            "Dual 4 MP, 2688х1520 pixels, autofocus, dual-LED (dual tone) flash\n" +
            "Features\n" +
            "1/3'' sensor size, 2µm pixel size, automatic simultaneous video and image recording, geo-tagging, face/smile detection, HDR, panorama\n" +
            "Video\n" +
            "1080p@60fps, 720p@120fps, HDR, stereo sound rec.\n" +
            "Secondary\n" +
            "5 MP, 1080p@30fps, HDR\n","Primary\n" +
            "13 MP, 4128 x 3096 pixels, autofocus, LED flash, check quality\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection, panorama, HDR\n" +
            "Video\n" +
            "1080p@30fps, check quality\n" +
            "Secondary\n" +
            "5 MP, 1080p\n","Primary\n" +
            "13 MP, 4128 x 3096 pixels, autofocus, LED flash, check quality\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection, panorama, HDR\n" +
            "Video\n" +
            "1080p@30fps, check quality\n" +
            "Secondary\n" +
            "5 MP, 1080p\n","Primary\n" +
            "13 MP, 4160 x 3120 pixels, autofocus, LED flash, check quality\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection, simultaneous HD video and image recording, HDR\n" +
            "Video\n" +
            "1080p@30fps, 720p@60fps, check quality\n" +
            "Secondary\n" +
            "8 MP, 1080p\n","Primary\n" +
            "4 MP, 2688 x 1520 pixels, autofocus, optical image stabilization, LED flash, check quality\n" +
            "Features\n" +
            "1/3'' sensor size, 2µm pixel size, simultaneous HD video and image recording, geo-tagging, face/smile detection\n" +
            "Video\n" +
            "1080p@30fps, 720p@60fps, optical stabilization, HDR, stereo sound rec.,, check quality\n" +
            "Secondary\n" +
            "2.1 MP, 1080p@30fps, HDR\n","Primary\n" +
            "13 MP, 4160 x 3120 pixels, autofocus, LED flash\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection, simultaneous HD video and image recording, HDR\n" +
            "Video\n" +
            "1080p@30fps, 720p@60fps\n" +
            "Secondary\n" +
            "5 MP, 1080p\n","Primary\n" +
            "13 MP, 4128 x 3096 pixels, autofocus, LED flash\n" +
            "Features\n" +
            "Geo-tagging, touch focus, face detection, panorama\n" +
            "Video\n" +
            "1080p@30fps\n" +
            "Secondary\n" +
            "5 MP, 1080p\n"};
    String[]price_htc={"1800$","1950$","1500$","2000$","2500$","1950$","1900$","1750$","2900$","1950$"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button b1=(Button)findViewById(R.id.button);
        Button b2=(Button)findViewById(R.id.button2);
        Button b3=(Button)findViewById(R.id.button3);
        Button b4=(Button)findViewById(R.id.button4);
        Button b5=(Button)findViewById(R.id.button5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"apple",Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,second.class);
                i.putExtra("text","Apple");
                i.putExtra("ke",aa);
                i.putExtra("apple_name",name_apple);
                i.putExtra("apple_body",body_apple);
                i.putExtra("apple_display",display_apple);
                i.putExtra("apple_memory",memory_apple);
                i.putExtra("apple_camera",camera_apple);
                i.putExtra("apple_price",price_apple);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"microsoft",Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,second.class);
                i.putExtra("text","Microsoft");
                i.putExtra("ke",mm);
                i.putExtra("apple_name",name_micro);
                i.putExtra("apple_body",body_micro);
                i.putExtra("apple_display",display_micro);
                i.putExtra("apple_memory",memory_micro);
                i.putExtra("apple_camera",camera_micro);
                i.putExtra("apple_price",price_micro);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"lenovo",Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,second.class);
                i.putExtra("text","Lenovo");
                i.putExtra("ke",ll);
                i.putExtra("apple_name",name_len);
                i.putExtra("apple_body",body_len);
                i.putExtra("apple_display",display_len);
                i.putExtra("apple_memory",memory_len);
                i.putExtra("apple_camera",camera_len);
                i.putExtra("apple_price",price_len);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"samsung",Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,second.class);
                i.putExtra("text","Samsung");
                i.putExtra("ke",ss);
                i.putExtra("apple_name",name_sam);
                i.putExtra("apple_body",body_sam);
                i.putExtra("apple_display",display_sam);
                i.putExtra("apple_memory",memory_sam);
                i.putExtra("apple_camera",camera_sam);
                i.putExtra("apple_price",price_sam);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"htc",Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,second.class);
                i.putExtra("text","Htc");
                i.putExtra("ke",hh);
                i.putExtra("apple_name",name_htc);
                i.putExtra("apple_body",body_htc);
                i.putExtra("apple_display",display_htc);
                i.putExtra("apple_memory",memory_htc);
                i.putExtra("apple_camera",camera_htc);
                i.putExtra("apple_price",price_htc);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            Intent i=new Intent(MainActivity.this,fav.class);
            DataBase db=new DataBase(this);
            ArrayList<Integer> arrayList1=db.getdata_image();
            ArrayList<String> arrayList2=db.getdata_name();
            ArrayList<String> arrayList3=db.getdata_body();
            ArrayList<String> arrayList4=db.getdata_display();
            ArrayList<String> arrayList5=db.getdata_memory();
            ArrayList<String> arrayList6=db.getdata_camera();
            ArrayList<String> arrayList7=db.getdata_price();

            i.putExtra("img",arrayList1);
            i.putExtra("name",arrayList2);
            i.putExtra("body",arrayList3);
            i.putExtra("display",arrayList4);
            i.putExtra("memory",arrayList5);
            i.putExtra("camera",arrayList6);
            i.putExtra("price",arrayList7);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
