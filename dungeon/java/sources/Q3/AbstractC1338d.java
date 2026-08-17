package Q3;

import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.AbstractC1987j;
import androidx.lifecycle.InterfaceC1994q;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Q3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1338d {
    public static final double a(Context context) {
        try {
            Object objJ = Z0.b.j(context, ActivityManager.class);
            Intrinsics.c(objJ);
            return ((ActivityManager) objJ).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final Context b(Context context) {
        return context.getApplicationContext();
    }

    public static final Drawable c(Context context, int i10) {
        Drawable drawableB = p161j.a.b(context, i10);
        if (drawableB != null) {
            return drawableB;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final Drawable d(Resources resources, int i10, Resources.Theme theme) {
        Drawable drawableF = p002a1.k.f(resources, i10, theme);
        if (drawableF != null) {
            return drawableF;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final AbstractC1987j e(Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof InterfaceC1994q)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((InterfaceC1994q) baseContext).y();
    }

    public static final Drawable f(Context context, Resources resources, int i10) throws XmlPullParserException, IOException {
        XmlResourceParser xml = resources.getXml(i10);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return d(resources, i10, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final long g(Context context) {
        int largeMemoryClass;
        try {
            Object objJ = Z0.b.j(context, ActivityManager.class);
            Intrinsics.c(objJ);
            ActivityManager activityManager = (ActivityManager) objJ;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        return ((long) largeMemoryClass) * 1048576;
    }
}
