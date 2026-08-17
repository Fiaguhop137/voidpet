package app.rive.runtime.kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class RiveTextureView$activity$2 extends o implements Function0<Activity> {
    final /* synthetic */ RiveTextureView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RiveTextureView$activity$2(RiveTextureView riveTextureView) {
        super(0);
        this.this$0 = riveTextureView;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Activity invoke() {
        Context context = this.this$0.getContext();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                Intrinsics.c(context);
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        context = null;
        Intrinsics.c(context);
        return (Activity) context;
    }
}
