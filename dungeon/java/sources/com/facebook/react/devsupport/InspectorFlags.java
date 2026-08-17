package com.facebook.react.devsupport;

import com.facebook.soloader.SoLoader;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@p276p6.a
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0087 J\t\u0010\u0006\u001a\u00020\u0005H\u0087 ¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/devsupport/InspectorFlags;", "", "<init>", "()V", "getFuseboxEnabled", "", "getIsProfilingBuild", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InspectorFlags {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InspectorFlags f29583a = new InspectorFlags();

    static {
        SoLoader.t("react_devsupportjni");
    }

    private InspectorFlags() {
    }

    @p276p6.a
    public static final native boolean getFuseboxEnabled();

    @p276p6.a
    public static final native boolean getIsProfilingBuild();
}
