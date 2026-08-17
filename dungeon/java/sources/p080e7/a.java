package p080e7;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0450a f40530b = new C0450a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f40531a;

    /* JADX INFO: renamed from: e7.a$a, reason: collision with other inner class name */
    public static final class C0450a {
        private C0450a() {
        }

        public /* synthetic */ C0450a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final m b(ReadableMap readableMap, Context context) {
            if (readableMap.hasKey("type") && readableMap.getType("type") == ReadableType.String) {
                String string = readableMap.getString("type");
                if (Intrinsics.b(string, "linear-gradient")) {
                    return n.f40590c.a(readableMap, context);
                }
                if (Intrinsics.b(string, "radial-gradient")) {
                    return s.f40633e.a(readableMap, context);
                }
            }
            return null;
        }

        public final a a(ReadableMap readableMap, Context context) {
            m mVarB;
            Intrinsics.checkNotNullParameter(context, "context");
            if (readableMap == null || (mVarB = b(readableMap, context)) == null) {
                return null;
            }
            return new a(mVarB, null);
        }
    }

    public a() {
    }

    private a(m mVar) {
        this();
        this.f40531a = mVar;
    }

    public /* synthetic */ a(m mVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar);
    }

    public final Shader a(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        m mVar = this.f40531a;
        if (mVar == null) {
            Intrinsics.r("gradient");
            mVar = null;
        }
        return mVar.a(bounds.width(), bounds.height());
    }
}
