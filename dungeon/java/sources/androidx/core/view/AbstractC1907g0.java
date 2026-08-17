package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: androidx.core.view.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1907g0 {

    /* JADX INFO: renamed from: androidx.core.view.g0$a */
    /* synthetic */ class a extends AbstractC3975l implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23218a = new a();

        a() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final Sequence a(View view) {
        return kotlin.sequences.k.q(view.getParent(), a.f23218a);
    }
}
