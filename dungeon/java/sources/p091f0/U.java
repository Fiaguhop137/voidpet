package p091f0;

import android.view.RenderNode;

/* JADX INFO: loaded from: classes.dex */
final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U f41582a = new U();

    private U() {
    }

    public final int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i10) {
        renderNode.setAmbientShadowColor(i10);
    }

    public final void d(RenderNode renderNode, int i10) {
        renderNode.setSpotShadowColor(i10);
    }
}
