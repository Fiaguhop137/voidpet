package p126h;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p126h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f42497a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // p126h.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    @Override // p126h.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public p108g.a c(int i10, Intent intent) {
        return new p108g.a(i10, intent);
    }
}
