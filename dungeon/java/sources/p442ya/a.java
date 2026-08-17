package p442ya;

import O8.A;
import O8.B;
import O8.z;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p352ta.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseArray f57980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseArray f57981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final AtomicReference f57982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f57983d;

    static {
        SparseArray sparseArray = new SparseArray();
        f57980a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f57981b = sparseArray2;
        f57982c = new AtomicReference();
        sparseArray.put(-1, z.FORMAT_UNKNOWN);
        sparseArray.put(1, z.FORMAT_CODE_128);
        sparseArray.put(2, z.FORMAT_CODE_39);
        sparseArray.put(4, z.FORMAT_CODE_93);
        sparseArray.put(8, z.FORMAT_CODABAR);
        sparseArray.put(16, z.FORMAT_DATA_MATRIX);
        sparseArray.put(32, z.FORMAT_EAN_13);
        sparseArray.put(64, z.FORMAT_EAN_8);
        sparseArray.put(128, z.FORMAT_ITF);
        sparseArray.put(256, z.FORMAT_QR_CODE);
        sparseArray.put(512, z.FORMAT_UPC_A);
        sparseArray.put(1024, z.FORMAT_UPC_E);
        sparseArray.put(2048, z.FORMAT_PDF417);
        sparseArray.put(4096, z.FORMAT_AZTEC);
        sparseArray2.put(0, A.TYPE_UNKNOWN);
        sparseArray2.put(1, A.TYPE_CONTACT_INFO);
        sparseArray2.put(2, A.TYPE_EMAIL);
        sparseArray2.put(3, A.TYPE_ISBN);
        sparseArray2.put(4, A.TYPE_PHONE);
        sparseArray2.put(5, A.TYPE_PRODUCT);
        sparseArray2.put(6, A.TYPE_SMS);
        sparseArray2.put(7, A.TYPE_TEXT);
        sparseArray2.put(8, A.TYPE_URL);
        sparseArray2.put(9, A.TYPE_WIFI);
        sparseArray2.put(10, A.TYPE_GEO);
        sparseArray2.put(11, A.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, A.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        f57983d = map;
        map.put(1, B.CODE_128);
        map.put(2, B.CODE_39);
        map.put(4, B.CODE_93);
        map.put(8, B.CODABAR);
        map.put(16, B.DATA_MATRIX);
        map.put(32, B.EAN_13);
        map.put(64, B.EAN_8);
        map.put(128, B.ITF);
        map.put(256, B.QR_CODE);
        map.put(512, B.UPC_A);
        map.put(1024, B.UPC_E);
        map.put(2048, B.PDF417);
        map.put(4096, B.AZTEC);
    }

    public static String a() {
        return true != b() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    static boolean b() {
        AtomicReference atomicReference = f57982c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zA = h.a(h.c().b());
        atomicReference.set(Boolean.valueOf(zA));
        return zA;
    }
}
