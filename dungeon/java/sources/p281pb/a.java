package p281pb;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50879a = new a();

    private a() {
    }

    public final boolean a() {
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (StringsKt.O(FINGERPRINT, "generic", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (StringsKt.O(FINGERPRINT, "unknown", false, 2, null)) {
            return true;
        }
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (StringsKt.U(MODEL, "google_sdk", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = MODEL.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt.U(lowerCase, "droid4x", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (StringsKt.U(MODEL, "Emulator", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (StringsKt.U(MODEL, "Android SDK built for x86", false, 2, null)) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (StringsKt.U(MANUFACTURER, "Genymotion", false, 2, null)) {
            return true;
        }
        String HARDWARE = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        if (StringsKt.U(HARDWARE, "goldfish", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        if (StringsKt.U(HARDWARE, "ranchu", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        if (StringsKt.U(HARDWARE, "vbox86", false, 2, null)) {
            return true;
        }
        String PRODUCT = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (StringsKt.U(PRODUCT, "sdk", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (StringsKt.U(PRODUCT, "google_sdk", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (StringsKt.U(PRODUCT, "sdk_google", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (StringsKt.U(PRODUCT, "sdk_x86", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (StringsKt.U(PRODUCT, "vbox86p", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (StringsKt.U(PRODUCT, "emulator", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (StringsKt.U(PRODUCT, "simulator", false, 2, null)) {
            return true;
        }
        String BOARD = Build.BOARD;
        Intrinsics.checkNotNullExpressionValue(BOARD, "BOARD");
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase2 = BOARD.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (StringsKt.U(lowerCase2, "nox", false, 2, null)) {
            return true;
        }
        String BOOTLOADER = Build.BOOTLOADER;
        Intrinsics.checkNotNullExpressionValue(BOOTLOADER, "BOOTLOADER");
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase3 = BOOTLOADER.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        if (StringsKt.U(lowerCase3, "nox", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase4 = HARDWARE.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
        if (StringsKt.U(lowerCase4, "nox", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase5 = PRODUCT.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
        if (StringsKt.U(lowerCase5, "nox", false, 2, null)) {
            return true;
        }
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        if (StringsKt.O(BRAND, "generic", false, 2, null)) {
            String DEVICE = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            if (StringsKt.O(DEVICE, "generic", false, 2, null)) {
                return true;
            }
        }
        return false;
    }
}
