package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 ,*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005:\u0001-B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/facebook/react/uimanager/ViewGroupManager;", "Landroid/view/ViewGroup;", "T", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/uimanager/w;", "Lcom/facebook/react/uimanager/q;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "createShadowNodeInstance", "()Lcom/facebook/react/uimanager/w;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "root", "", "extraData", "", "updateExtraData", "(Landroid/view/ViewGroup;Ljava/lang/Object;)V", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "", "views", "addViews", "(Landroid/view/ViewGroup;Ljava/util/List;)V", "getChildCount", "(Landroid/view/ViewGroup;)I", "getChildAt", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "removeViewAt", "(Landroid/view/ViewGroup;I)V", "view", "removeView", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "", "needsCustomLayoutForChildren", "()Z", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, C2279w> implements InterfaceC2273q {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final WeakHashMap<View, Integer> zIndexHash = new WeakHashMap<>();

    /* JADX INFO: renamed from: com.facebook.react.uimanager.ViewGroupManager$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Integer a(View view) {
            return (Integer) ViewGroupManager.zIndexHash.get(view);
        }

        public final void b(View view, int i10) {
            Intrinsics.checkNotNullParameter(view, "view");
            ViewGroupManager.zIndexHash.put(view, Integer.valueOf(i10));
        }
    }

    public ViewGroupManager() {
        this(null, 1, null);
    }

    public ViewGroupManager(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public /* synthetic */ ViewGroupManager(ReactApplicationContext reactApplicationContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : reactApplicationContext);
    }

    @Nullable
    public static final Integer getViewZIndex(@Nullable View view) {
        return INSTANCE.a(view);
    }

    public static final void setViewZIndex(@NotNull View view, int i10) {
        INSTANCE.b(view, i10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC2273q
    public void addView(@NotNull T parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        parent.addView(child, index);
    }

    public final void addViews(@NotNull T parent, @NotNull List<? extends View> views) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(views, "views");
        UiThreadUtil.assertOnUiThread();
        int i10 = 0;
        for (Object obj : views) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.v();
            }
            addView((ViewGroup) parent, (View) obj, i10);
            i10 = i11;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public C2279w createShadowNodeInstance() {
        return new C2279w();
    }

    @Override // com.facebook.react.uimanager.InterfaceC2273q
    @Nullable
    public View getChildAt(@NotNull T parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getChildAt(index);
    }

    @Override // com.facebook.react.uimanager.InterfaceC2273q
    public int getChildCount(@NotNull T parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<? extends C2279w> getShadowNodeClass() {
        return C2279w.class;
    }

    @Override // com.facebook.react.uimanager.r
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(@NotNull View view) {
        super.removeAllViews(view);
    }

    public void removeView(@NotNull T parent, @NotNull View view) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        UiThreadUtil.assertOnUiThread();
        int childCount = getChildCount((ViewGroup) parent);
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt((ViewGroup) parent, i10) == view) {
                removeViewAt((ViewGroup) parent, i10);
                return;
            }
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC2273q
    public void removeViewAt(@NotNull T parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        UiThreadUtil.assertOnUiThread();
        parent.removeViewAt(index);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(@NotNull T root, @NotNull Object extraData) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
    }
}
