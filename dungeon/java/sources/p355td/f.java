package p355td;

import Gd.a;
import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
public enum f {
    StartStartup("startStartup"),
    EndStartup("endStartup"),
    Check("check"),
    CheckCompleteUnavailable("checkCompleteUnavailable"),
    CheckCompleteAvailable("checkCompleteAvailable"),
    CheckError("checkError"),
    Download("download"),
    DownloadProgress("downloadProgress"),
    DownloadComplete("downloadComplete"),
    DownloadError("downloadError"),
    Restart("restart");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f54663n = a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54664a;

    f(String str) {
        this.f54664a = str;
    }
}
