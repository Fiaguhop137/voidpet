package app.rive;

import I.X;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"app/rive/ViewModelInstanceKt$rememberViewModelInstance$1$invoke$$inlined$onDispose$1", "LI/X;", "", "dispose", "()V", "runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewModelInstanceKt$rememberViewModelInstance$1$invoke$$inlined$onDispose$1 implements X {
    final /* synthetic */ ViewModelInstance $instance$inlined;

    public ViewModelInstanceKt$rememberViewModelInstance$1$invoke$$inlined$onDispose$1(ViewModelInstance viewModelInstance) {
        this.$instance$inlined = viewModelInstance;
    }

    @Override // I.X
    public void dispose() {
        this.$instance$inlined.close();
    }
}
