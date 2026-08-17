package expo.modules.kotlin.views;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.react.uimanager.C2241a;
import com.facebook.react.uimanager.InterfaceC2260j0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends LinearLayout {

    @NotNull
    private final Rb.d appContext;

    @NotNull
    private final n shadowNodeProxy;
    private final boolean shouldUseAndroidLayout;

    @Nullable
    private InterfaceC2260j0 stateWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Rb.d appContext) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
        this.shadowNodeProxy = new n(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(h hVar) {
        hVar.measureAndLayout();
    }

    public void clipToPaddingBox(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (getClipToPadding()) {
            C2241a.a(this, canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        clipToPaddingBox(canvas);
        super.dispatchDraw(canvas);
    }

    @NotNull
    public final Rb.d getAppContext() {
        return this.appContext;
    }

    @NotNull
    public final n getShadowNodeProxy() {
        return this.shadowNodeProxy;
    }

    public boolean getShouldUseAndroidLayout() {
        return this.shouldUseAndroidLayout;
    }

    @Nullable
    public final InterfaceC2260j0 getStateWrapper() {
        return this.stateWrapper;
    }

    public final void measureAndLayout() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (getShouldUseAndroidLayout()) {
            post(new g(this));
        }
    }

    public final void setStateWrapper(@Nullable InterfaceC2260j0 interfaceC2260j0) {
        this.stateWrapper = interfaceC2260j0;
    }
}
