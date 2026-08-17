package app.rive.runtime.kotlin.core;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;
import p166j4.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/android/volley/o;", "invoke", "()Lcom/android/volley/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
final class CDNAssetLoader$queue$2 extends o implements Function0<com.android.volley.o> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CDNAssetLoader$queue$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final com.android.volley.o invoke() {
        return k.a(this.$context);
    }
}
