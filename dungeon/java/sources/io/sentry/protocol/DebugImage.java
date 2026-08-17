package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DebugImage implements B0 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";

    @Nullable
    private String arch;

    @Nullable
    private String codeFile;

    @Nullable
    private String codeId;

    @Nullable
    private String debugFile;

    @Nullable
    private String debugId;

    @Nullable
    private String imageAddr;

    @Nullable
    private Long imageSize;

    @Nullable
    private String type;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private String uuid;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DebugImage a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            DebugImage debugImage = new DebugImage();
            interfaceC3724j1.I();
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "debug_file":
                        debugImage.debugFile = interfaceC3724j1.D2();
                        break;
                    case "image_addr":
                        debugImage.imageAddr = interfaceC3724j1.D2();
                        break;
                    case "image_size":
                        debugImage.imageSize = interfaceC3724j1.x2();
                        break;
                    case "code_file":
                        debugImage.codeFile = interfaceC3724j1.D2();
                        break;
                    case "arch":
                        debugImage.arch = interfaceC3724j1.D2();
                        break;
                    case "type":
                        debugImage.type = interfaceC3724j1.D2();
                        break;
                    case "uuid":
                        debugImage.uuid = interfaceC3724j1.D2();
                        break;
                    case "debug_id":
                        debugImage.debugId = interfaceC3724j1.D2();
                        break;
                    case "code_id":
                        debugImage.codeId = interfaceC3724j1.D2();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        interfaceC3724j1.M2(iLogger, map, strX0);
                        break;
                }
            }
            interfaceC3724j1.T();
            debugImage.setUnknown(map);
            return debugImage;
        }
    }

    @Nullable
    public String getArch() {
        return this.arch;
    }

    @Nullable
    public String getCodeFile() {
        return this.codeFile;
    }

    @Nullable
    public String getCodeId() {
        return this.codeId;
    }

    @Nullable
    public String getDebugFile() {
        return this.debugFile;
    }

    @Nullable
    public String getDebugId() {
        return this.debugId;
    }

    @Nullable
    public String getImageAddr() {
        return this.imageAddr;
    }

    @Nullable
    public Long getImageSize() {
        return this.imageSize;
    }

    @Nullable
    public String getType() {
        return this.type;
    }

    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.B0
    public void serialize(@NotNull InterfaceC3729k1 interfaceC3729k1, @NotNull ILogger iLogger) throws IOException {
        interfaceC3729k1.I();
        if (this.uuid != null) {
            interfaceC3729k1.d("uuid").e(this.uuid);
        }
        if (this.type != null) {
            interfaceC3729k1.d("type").e(this.type);
        }
        if (this.debugId != null) {
            interfaceC3729k1.d("debug_id").e(this.debugId);
        }
        if (this.debugFile != null) {
            interfaceC3729k1.d("debug_file").e(this.debugFile);
        }
        if (this.codeId != null) {
            interfaceC3729k1.d("code_id").e(this.codeId);
        }
        if (this.codeFile != null) {
            interfaceC3729k1.d("code_file").e(this.codeFile);
        }
        if (this.imageAddr != null) {
            interfaceC3729k1.d("image_addr").e(this.imageAddr);
        }
        if (this.imageSize != null) {
            interfaceC3729k1.d("image_size").i(this.imageSize);
        }
        if (this.arch != null) {
            interfaceC3729k1.d("arch").e(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.unknown.get(str));
            }
        }
        interfaceC3729k1.T();
    }

    public void setArch(@Nullable String str) {
        this.arch = str;
    }

    public void setCodeFile(@Nullable String str) {
        this.codeFile = str;
    }

    public void setCodeId(@Nullable String str) {
        this.codeId = str;
    }

    public void setDebugFile(@Nullable String str) {
        this.debugFile = str;
    }

    public void setDebugId(@Nullable String str) {
        this.debugId = str;
    }

    public void setImageAddr(@Nullable String str) {
        this.imageAddr = str;
    }

    public void setImageSize(long j10) {
        this.imageSize = Long.valueOf(j10);
    }

    public void setImageSize(@Nullable Long l10) {
        this.imageSize = l10;
    }

    public void setType(@Nullable String str) {
        this.type = str;
    }

    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(@Nullable String str) {
        this.uuid = str;
    }
}
