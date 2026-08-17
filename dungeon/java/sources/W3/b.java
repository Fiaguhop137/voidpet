package W3;

import R3.InterfaceC1356c;
import R3.O;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Map;
import p077e4.g;
import p077e4.r;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f14621d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f14624c;

    public b(Drawable.Callback callback, String str, InterfaceC1356c interfaceC1356c, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f14623b = str;
        } else {
            this.f14623b = str + '/';
        }
        this.f14624c = map;
        d(interfaceC1356c);
        if (callback instanceof View) {
            this.f14622a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f14622a = null;
        }
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (f14621d) {
            ((O) this.f14624c.get(str)).g(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        O o10 = (O) this.f14624c.get(str);
        if (o10 == null) {
            return null;
        }
        Bitmap bitmapB = o10.b();
        if (bitmapB != null) {
            return bitmapB;
        }
        Context context = this.f14622a;
        if (context == null) {
            return null;
        }
        String strC = o10.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                    if (bitmapDecodeByteArray != null) {
                        return c(str, r.m(bitmapDecodeByteArray, o10.f(), o10.d()));
                    }
                    g.c("Decoded image `" + str + "` is null.");
                    return null;
                } catch (IllegalArgumentException e10) {
                    g.d("Unable to decode image `" + str + "`.", e10);
                    return null;
                }
            } catch (IllegalArgumentException e11) {
                g.d("data URL did not have correct base64 format.", e11);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f14623b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f14623b + strC), null, options);
                if (bitmapDecodeStream != null) {
                    return c(str, r.m(bitmapDecodeStream, o10.f(), o10.d()));
                }
                g.c("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e12) {
                g.d("Unable to decode image `" + str + "`.", e12);
                return null;
            }
        } catch (IOException e13) {
            g.d("Unable to open asset.", e13);
            return null;
        }
    }

    public boolean b(Context context) {
        if (context == null) {
            return this.f14622a == null;
        }
        if (this.f14622a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f14622a;
    }

    public void d(InterfaceC1356c interfaceC1356c) {
    }
}
