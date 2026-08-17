package p433y1;

import androidx.datastore.preferences.protobuf.C1965v;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p379v1.C4230d;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f57753a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(InputStream input) throws C4230d {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                f fVarS = f.S(input);
                Intrinsics.checkNotNullExpressionValue(fVarS, "{\n                Prefer…From(input)\n            }");
                return fVarS;
            } catch (C1965v e10) {
                throw new C4230d("Unable to parse preferences proto.", e10);
            }
        }
    }
}
