package yan.biyan;

/*
 * Copyright (c) This is zhaoxubin's Java program.
 * Copyright belongs to the crabapple organization.
 * The crabapple organization has all rights to this program.
 * No individual or organization can refer to or reproduce this program without permission.
 * If you need to reprint or quote, please post it to zhaoxubin2016@live.com.
 * You will get a reply within a week,
 *
 */

import yan.biyan.exception.FormatException;

import java.util.HashMap;
import java.util.Map;

public class FileType {

    public static Map<String, String> FILE_TYPE;

    public static String getByFormat(String format) {

        if (format == null) throw new NullPointerException();
        if (format.charAt(0) != '.') throw new FormatException();

        return FILE_TYPE.get(format);
    }

    static {
        FILE_TYPE = new HashMap<>((172 << 2));
        FILE_TYPE.put(".xdp", "application/vnd.adobe.xdp");
        FILE_TYPE.put(".mpeg", "video/mpg");
        FILE_TYPE.put(".xdr", "text/xml");
        FILE_TYPE.put(".mns", "audio/x-musicnet-stream");
        FILE_TYPE.put(".awf", "application/vnd.adobe.workflow");
        FILE_TYPE.put(".mp3", "audio/mp3");
        FILE_TYPE.put(".mp4", "video/mpeg4");
        FILE_TYPE.put(".mp1", "audio/mp1");
        FILE_TYPE.put(".wax", "audio/x-ms-wax");
        FILE_TYPE.put(".mp2", "audio/mp2");
        FILE_TYPE.put(".gbr", "application/x-gbr");
        FILE_TYPE.put(".mpg", "video/mpg");
        FILE_TYPE.put(".mpe", "video/x-mpeg");
        FILE_TYPE.put(".nrf", "application/x-nrf");
        FILE_TYPE.put(".mpd", "application/vnd.ms-project");
        FILE_TYPE.put(".mpa", "video/x-mpg");
        FILE_TYPE.put(".mpp", "application/vnd.ms-project");
        FILE_TYPE.put(".", "application/x-");
        FILE_TYPE.put(".igs", "application/x-igs");
        FILE_TYPE.put(".xslt", "text/xml");
        FILE_TYPE.put(".fax", "image/fax");
        FILE_TYPE.put(".hgl", "application/x-hgl");
        FILE_TYPE.put(".iii", "application/x-iphone");
        FILE_TYPE.put(".mpga", "audio/rn-mpeg");
        FILE_TYPE.put(".mpw", "application/vnd.ms-project");
        FILE_TYPE.put(".mpx", "application/vnd.ms-project");
        FILE_TYPE.put(".mpv", "video/mpg");
        FILE_TYPE.put(".mps", "video/x-mpeg");
        FILE_TYPE.put(".mpt", "application/vnd.ms-project");
        FILE_TYPE.put(".xfd", "application/vnd.adobe.xfd");
        FILE_TYPE.put(".wbmp", "image/vnd.wap.wbmp");
        FILE_TYPE.put(".fdf", "application/vnd.fdf");
        FILE_TYPE.put(".xquery", "text/xml");
        FILE_TYPE.put(".pwz", "application/vnd.ms-powerpoint");
        FILE_TYPE.put(".out", "application/x-out");
        FILE_TYPE.put(".vcf", "text/x-vcard");
        FILE_TYPE.put(".p7s", "application/pkcs7-signature");
        FILE_TYPE.put(".vdx", "application/vnd.visio");
        FILE_TYPE.put(".p7r", "application/x-pkcs7-certreqresp");
        FILE_TYPE.put(".p7m", "application/pkcs7-mime");
        FILE_TYPE.put(".vda", "application/x-vda");
        FILE_TYPE.put(".smil", "application/smil");
        FILE_TYPE.put(".p7c", "application/pkcs7-mime");
        FILE_TYPE.put(".p7b", "application/x-pkcs7-certificates");
        FILE_TYPE.put(".dbf", "application/x-dbf");
        FILE_TYPE.put(".m1v", "video/x-mpeg");
        FILE_TYPE.put(".gif", "image/gif");
        FILE_TYPE.put(".dcd", "text/xml");
        FILE_TYPE.put(".img", "application/x-img");
        FILE_TYPE.put(".nws", "message/rfc822");
        FILE_TYPE.put(".m2v", "video/x-mpeg");
        FILE_TYPE.put(".mtx", "text/xml");
        FILE_TYPE.put(".ai", "application/postscript");
        FILE_TYPE.put(".dbm", "application/x-dbm");
        FILE_TYPE.put(".edn", "application/vnd.adobe.edn");
        FILE_TYPE.put(".dbx", "application/x-dbx");
        FILE_TYPE.put(".au", "audio/basic");
        FILE_TYPE.put(".wk4", "application/x-wk4");
        FILE_TYPE.put(".jpg", "application/x-jpg");
        FILE_TYPE.put(".m4e", "video/mpeg4");
        FILE_TYPE.put(".jpe", "application/x-jpe");
        FILE_TYPE.put(".sam", "application/x-sam");
        FILE_TYPE.put(".wk3", "application/x-wk3");
        FILE_TYPE.put(".gl2", "application/x-gl2");
        FILE_TYPE.put(".ltr", "application/x-ltr");
        FILE_TYPE.put(".wiz", "application/msword");
        FILE_TYPE.put(".sat", "application/x-sat");
        FILE_TYPE.put(".cal", "application/x-cals");
        FILE_TYPE.put(".m3u", "audio/mpegurl");
        FILE_TYPE.put(".dcx", "application/x-dcx");
        FILE_TYPE.put(".cat", "application/vnd.ms-pki.seccat");
        FILE_TYPE.put(".mocha", "application/x-javascript");
        FILE_TYPE.put(".fif", "application/fractals");
        FILE_TYPE.put(".xlw", "application/x-xlw");
        FILE_TYPE.put(".906", "application/x-906");
        FILE_TYPE.put(".907", "drawing/907");
        FILE_TYPE.put(".xls", "application/x-xls");
        FILE_TYPE.put(".hmr", "application/x-hmr");
        FILE_TYPE.put(".ins", "application/x-internet-signup");
        FILE_TYPE.put(".tdf", "application/x-tdf");
        FILE_TYPE.put(".ras", "application/x-ras");
        FILE_TYPE.put(".cdf", "application/x-netcdf");
        FILE_TYPE.put(".mxp", "application/x-mmxp");
        FILE_TYPE.put(".rat", "application/rat-file");
        FILE_TYPE.put(".tg4", "application/x-tg4");
        FILE_TYPE.put(".ram", "audio/x-pn-realaudio");
        FILE_TYPE.put(".wks", "application/x-wks");
        FILE_TYPE.put(".der", "application/x-x509-ca-cert");
        FILE_TYPE.put(".wkq", "application/x-wkq");
        FILE_TYPE.put(".ipa", "application/vnd.iphone");
        FILE_TYPE.put(".xml", "text/xml");
        FILE_TYPE.put(".sdp", "application/sdp");
        FILE_TYPE.put(".cel", "application/x-cel");
        FILE_TYPE.put(".dgn", "application/x-dgn");
        FILE_TYPE.put(".wma", "audio/x-ms-wma");
        FILE_TYPE.put(".sdw", "application/x-sdw");
        FILE_TYPE.put(".jsp", "text/html");
        FILE_TYPE.put(".cdr", "application/x-cdr");
        FILE_TYPE.put(".g4", "application/x-g4");
        FILE_TYPE.put(".hpl", "application/x-hpl");
        FILE_TYPE.put(".wmz", "application/x-ms-wmz");
        FILE_TYPE.put(".wmx", "video/x-ms-wmx");
        FILE_TYPE.put(".wmv", "video/x-ms-wmv");
        FILE_TYPE.put(".hpg", "application/x-hpgl");
        FILE_TYPE.put(".gp4", "application/x-gp4");
        FILE_TYPE.put(".cer", "application/x-x509-ca-cert");
        FILE_TYPE.put(".cg4", "application/x-g4");
        FILE_TYPE.put(".wmf", "application/x-wmf");
        FILE_TYPE.put(".tga", "application/x-tga");
        FILE_TYPE.put(".wmd", "application/x-ms-wmd");
        FILE_TYPE.put(".fo", "text/xml");
        FILE_TYPE.put(".uin", "application/x-icq");
        FILE_TYPE.put(".wml", "text/vnd.wap.wml");
        FILE_TYPE.put(".cgm", "application/x-cgm");
        FILE_TYPE.put(".isp", "application/x-internet-signup");
        FILE_TYPE.put(".rdf", "text/xml");
        FILE_TYPE.put(".xpl", "audio/scpls");
        FILE_TYPE.put(".dib", "application/x-dib");
        FILE_TYPE.put(".wp6", "application/x-wp6");
        FILE_TYPE.put(".tiff", "image/tiff");
        FILE_TYPE.put(".pc5", "application/x-pc5");
        FILE_TYPE.put(".wpd", "application/x-wpd");
        FILE_TYPE.put(".vml", "text/xml");
        FILE_TYPE.put(".xql", "text/xml");
        FILE_TYPE.put(".rec", "application/vnd.rn-recording");
        FILE_TYPE.put(".tif", "application/x-tif");
        FILE_TYPE.put(".red", "application/x-red");
        FILE_TYPE.put(".acp", "audio/x-mei-aac");
        FILE_TYPE.put(".hqx", "application/mac-binhex40");
        FILE_TYPE.put(".hrf", "application/x-hrf");
        FILE_TYPE.put(".wq1", "application/x-wq1");
        FILE_TYPE.put(".eml", "message/rfc822");
        FILE_TYPE.put(".emf", "application/x-emf");
        FILE_TYPE.put(".rgb", "application/x-rgb");
        FILE_TYPE.put(".xsd", "text/xml");
        FILE_TYPE.put(".wpl", "application/vnd.ms-wpl");
        FILE_TYPE.put(".wpg", "application/x-wpg");
        FILE_TYPE.put(".uls", "text/iuls");
        FILE_TYPE.put(".IVF", "video/x-ivf");
        FILE_TYPE.put(".wr1", "application/x-wr1");
        FILE_TYPE.put(".dll", "application/x-msdownload");
        FILE_TYPE.put(".pcx", "application/x-pcx");
        FILE_TYPE.put(".htm", "text/html");
        FILE_TYPE.put(".sit", "application/x-stuffit");
        FILE_TYPE.put(".htx", "text/html");
        FILE_TYPE.put(".rmvb", "application/vnd.rn-realmedia-vbr");
        FILE_TYPE.put(".tld", "text/xml");
        FILE_TYPE.put(".java", "java/*");
        FILE_TYPE.put(".vpg", "application/x-vpeg005");
        FILE_TYPE.put(".ent", "text/xml");
        FILE_TYPE.put(".htt", "text/webviewhtml");
        FILE_TYPE.put(".hta", "application/hta");
        FILE_TYPE.put(".xsl", "text/xml");
        FILE_TYPE.put(".cit", "application/x-cit");
        FILE_TYPE.put(".js", "application/x-javascript");
        FILE_TYPE.put(".sis", "application/vnd.symbian.install");
        FILE_TYPE.put(".pcl", "application/x-pcl");
        FILE_TYPE.put(".pci", "application/x-pci");
        FILE_TYPE.put(".ws2", "application/x-ws");
        FILE_TYPE.put(".htc", "text/x-component");
        FILE_TYPE.put(".xhtml", "text/html");
        FILE_TYPE.put(".pdx", "application/vnd.adobe.pdx");
        FILE_TYPE.put(".wsc", "text/scriptlet");
        FILE_TYPE.put(".pdf", "application/pdf");
        FILE_TYPE.put(".wrk", "application/x-wrk");
        FILE_TYPE.put(".wri", "application/x-wri");
        FILE_TYPE.put(".frm", "application/x-frm");
        FILE_TYPE.put(".epi", "application/x-epi");
        FILE_TYPE.put(".sld", "application/x-sld");
        FILE_TYPE.put(".eps", "application/postscript");
        FILE_TYPE.put(".slb", "application/x-slb");
        FILE_TYPE.put(".class", "java/*");
        FILE_TYPE.put(".mp2v", "video/mpeg");
        FILE_TYPE.put(".biz", "text/xml");
        FILE_TYPE.put(".ls", "application/x-javascript");
        FILE_TYPE.put(".mpv2", "video/mpeg");
        FILE_TYPE.put(".jfif", "image/jpeg");
        FILE_TYPE.put(".xwd", "application/x-xwd");
        FILE_TYPE.put(".cml", "text/xml");
        FILE_TYPE.put(".pfx", "application/x-pkcs12");
        FILE_TYPE.put(".aif", "audio/aiff");
        FILE_TYPE.put(".mi", "application/x-mi");
        FILE_TYPE.put(".dot", "application/msword");
        FILE_TYPE.put(".cmp", "application/x-cmp");
        FILE_TYPE.put(".vsd", "application/x-vsd");
        FILE_TYPE.put(".slk", "drawing/x-slk");
        FILE_TYPE.put(".odc", "text/x-ms-odc");
        FILE_TYPE.put(".rjt", "application/vnd.rn-realsystem-rjt");
        FILE_TYPE.put(".rjs", "application/vnd.rn-realsystem-rjs");
        FILE_TYPE.put(".doc", "application/msword");
        FILE_TYPE.put(".html", "text/html");
        FILE_TYPE.put(".rle", "application/x-rle");
        FILE_TYPE.put(".rlc", "application/x-rlc");
        FILE_TYPE.put(".snd", "audio/basic");
        FILE_TYPE.put(".pgl", "application/x-pgl");
        FILE_TYPE.put(".top", "drawing/x-top");
        FILE_TYPE.put(".rsml", "application/vnd.rn-rsml");
        FILE_TYPE.put(".smk", "application/x-smk");
        FILE_TYPE.put(".cmx", "application/x-cmx");
        FILE_TYPE.put(".mac", "application/x-mac");
        FILE_TYPE.put(".smi", "application/smil");
        FILE_TYPE.put(".la1", "audio/x-liquid-file");
        FILE_TYPE.put(".man", "application/x-troff-man");
        FILE_TYPE.put(".vsw", "application/vnd.visio");
        FILE_TYPE.put(".vsx", "application/vnd.visio");
        FILE_TYPE.put(".vss", "application/vnd.visio");
        FILE_TYPE.put(".vst", "application/x-vst");
        FILE_TYPE.put(".bmp", "application/x-bmp");
        FILE_TYPE.put(".mhtml", "message/rfc822");
        FILE_TYPE.put(".pic", "application/x-pic");
        FILE_TYPE.put(".rmf", "application/vnd.adobe.rmf");
        FILE_TYPE.put(".cot", "application/x-cot");
        FILE_TYPE.put(".math", "text/xml");
        FILE_TYPE.put(".301", "application/x-301");
        FILE_TYPE.put(".lavs", "audio/x-liquid-secure");
        FILE_TYPE.put(".vtx", "application/vnd.visio");
        FILE_TYPE.put(".wvx", "video/x-ms-wvx");
        FILE_TYPE.put(".aiff", "audio/aiff");
        FILE_TYPE.put(".aifc", "audio/aiff");
        FILE_TYPE.put(".pl", "application/x-perl");
        FILE_TYPE.put(".mdb", "application/x-mdb");
        FILE_TYPE.put(".drw", "application/x-drw");
        FILE_TYPE.put(".spc", "application/x-pkcs7-certificates");
        FILE_TYPE.put(".pr", "application/x-pr");
        FILE_TYPE.put(".etd", "application/x-ebx");
        FILE_TYPE.put(".ps", "application/postscript");
        FILE_TYPE.put(".rmp", "application/vnd.rn-rn_music_package");
        FILE_TYPE.put(".rmm", "audio/x-pn-realaudio");
        FILE_TYPE.put(".sol", "text/plain");
        FILE_TYPE.put(".rmi", "audio/mid");
        FILE_TYPE.put(".rmj", "application/vnd.rn-realsystem-rmj");
        FILE_TYPE.put(".lar", "application/x-laplayer-reg");
        FILE_TYPE.put(".net", "image/pnetvue");
        FILE_TYPE.put(".rmx", "application/vnd.rn-realsystem-rmx");
        FILE_TYPE.put(".rms", "application/vnd.rn-realmedia-secure");
        FILE_TYPE.put(".sor", "text/plain");
        FILE_TYPE.put(".tsd", "text/xml");
        FILE_TYPE.put(".bot", "application/x-bot");
        FILE_TYPE.put(".323", "text/h323");
        FILE_TYPE.put(".spp", "text/xml");
        FILE_TYPE.put(".spl", "application/futuresplash");
        FILE_TYPE.put(".sisx", "application/vnd.symbian.install");
        FILE_TYPE.put(".rnx", "application/vnd.rn-realplayer");
        FILE_TYPE.put(".ra", "audio/vnd.rn-realaudio");
        FILE_TYPE.put(".lbm", "application/x-lbm");
        FILE_TYPE.put(".crt", "application/x-x509-ca-cert");
        FILE_TYPE.put(".rm", "application/vnd.rn-realmedia");
        FILE_TYPE.put(".plg", "text/html");
        FILE_TYPE.put(".rp", "image/vnd.rn-realpix");
        FILE_TYPE.put(".anv", "application/x-anv");
        FILE_TYPE.put(".dtd", "text/xml");
        FILE_TYPE.put(".pko", "application/vnd.ms-pki.pko");
        FILE_TYPE.put(".rt", "text/vnd.rn-realtext");
        FILE_TYPE.put(".rv", "video/vnd.rn-realvideo");
        FILE_TYPE.put(".midi", "audio/mid");
        FILE_TYPE.put(".crl", "application/pkix-crl");
        FILE_TYPE.put(".css", "text/css");
        FILE_TYPE.put(".ssm", "application/streamingmedia");
        FILE_TYPE.put(".rpm", "audio/x-pn-realaudio-plugin");
        FILE_TYPE.put(".plt", "application/x-plt");
        FILE_TYPE.put(".csi", "application/x-csi");
        FILE_TYPE.put(".mfp", "application/x-shockwave-flash");
        FILE_TYPE.put(".pls", "audio/scpls");
        FILE_TYPE.put(".stm", "text/html");
        FILE_TYPE.put(".stl", "application/vnd.ms-pki.stl");
        FILE_TYPE.put(".jpeg", "image/jpeg");
        FILE_TYPE.put(".png", "application/x-png");
        FILE_TYPE.put(".sst", "application/vnd.ms-pki.certstore");
        FILE_TYPE.put(".exe", "application/x-msdownload");
        FILE_TYPE.put(".apk", "application/vnd.android.package-archive");
        FILE_TYPE.put(".lmsff", "audio/x-la-lms");
        FILE_TYPE.put(".cut", "application/x-cut");
        FILE_TYPE.put(".a11", "application/x-a11");
        FILE_TYPE.put(".mid", "audio/mid");
        FILE_TYPE.put(".dwg", "application/x-dwg");
        FILE_TYPE.put(".wsdl", "text/xml");
        FILE_TYPE.put(".dwf", "application/x-dwf");
        FILE_TYPE.put(".001", "application/x-001");
        FILE_TYPE.put(".sty", "application/x-sty");
        FILE_TYPE.put(".mht", "message/rfc822");
        FILE_TYPE.put(".rtf", "application/x-rtf");
        FILE_TYPE.put(".svg", "text/xml");
        FILE_TYPE.put(".c4t", "application/x-c4t");
        FILE_TYPE.put(".ppa", "application/vnd.ms-powerpoint");
        FILE_TYPE.put(".ppm", "application/x-ppm");
        FILE_TYPE.put(".x_t", "application/x-x_t");
        FILE_TYPE.put(".movie", "video/x-sgi-movie");
        FILE_TYPE.put(".pot", "application/vnd.ms-powerpoint");
        FILE_TYPE.put(".dxf", "application/x-dxf");
        FILE_TYPE.put(".mil", "application/x-mil");
        FILE_TYPE.put(".dxb", "application/x-dxb");
        FILE_TYPE.put(".x_b", "application/x-x_b");
        FILE_TYPE.put(".swf", "application/x-shockwave-flash");
        FILE_TYPE.put(".wm", "video/x-ms-wm");
        FILE_TYPE.put(".asp", "text/asp");
        FILE_TYPE.put(".ws", "application/x-ws");
        FILE_TYPE.put(".icb", "application/x-icb");
        FILE_TYPE.put(".torrent", "application/x-bittorrent");
        FILE_TYPE.put(".asx", "video/x-ms-asf");
        FILE_TYPE.put(".asf", "video/x-ms-asf");
        FILE_TYPE.put(".ppt", "application/x-ppt");
        FILE_TYPE.put(".pps", "application/vnd.ms-powerpoint");
        FILE_TYPE.put(".txt", "text/plain");
        FILE_TYPE.put(".asa", "text/asa");
        FILE_TYPE.put(".prf", "application/pics-rules");
        FILE_TYPE.put(".xq", "text/xml");
        FILE_TYPE.put(".prn", "application/x-prn");
        FILE_TYPE.put(".xap", "application/x-silverlight-app");
        FILE_TYPE.put(".vxml", "text/xml");
        FILE_TYPE.put(".ico", "application/x-ico");
        FILE_TYPE.put(".r3t", "text/vnd.rn-realtext3d");
        FILE_TYPE.put(".p12", "application/x-pkcs12");
        FILE_TYPE.put(".p10", "application/pkcs10");
        FILE_TYPE.put(".latex", "application/x-latex");
        FILE_TYPE.put(".mml", "text/xml");
        FILE_TYPE.put(".wb3", "application/x-wb3");
        FILE_TYPE.put(".wb1", "application/x-wb1");
        FILE_TYPE.put(".wb2", "application/x-wb2");
        FILE_TYPE.put(".prt", "application/x-prt");
        FILE_TYPE.put(".c90", "application/x-c90");
        FILE_TYPE.put(".xfdf", "application/vnd.adobe.xfdf");
        FILE_TYPE.put(".mnd", "audio/x-musicnet-download");
        FILE_TYPE.put(".wav", "audio/wav");
        FILE_TYPE.put(".ptn", "application/x-ptn");
        FILE_TYPE.put(".iff", "application/x-iff");
        FILE_TYPE.put(".avi", "video/avi");
        FILE_TYPE.put(".ig4", "application/x-g4");
    }


}