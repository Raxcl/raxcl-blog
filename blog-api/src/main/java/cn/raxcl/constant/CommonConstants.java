package cn.raxcl.constant;

/**
 * @author c-long.chan
 * @date 2022-01-04 19:08:50
 */
public class CommonConstants {

    private CommonConstants(){}

    public static final String IMAGE = "image";

    public static final String ROLE_ADMIN = "ROLE_admin";

    /**
     *  GitHub上传文件API
     */
    public static final String GITHUB_UPLOAD_API = "https://api.github.com/repos/%s/%s/contents%s/%s";

    /**
     * GitHub上传文件API
     */
    public static final String CDN_URL4_GITHUB = "https://cdn.jsdelivr.net/gh/%s/%s%s/%s";

    public static final String SUBJECT_MSG = "博主身份Token已失效，请重新登录！";
    //todo
    public static final String PATH_ADMIN = "/RBlog/admin";
    public static final String ABOUT = "/about";
    public static final String FRIENDS = "/friends";
    public static final String BLOG = "/blog/";
    public static final String COMMENTS = "/comments";

    public static final Integer ZERO = 0;
    public static final Integer ONE = 1;
    public static final Integer TWO = 2;
    public static final Integer FOUR = 4;
    public static final Integer TWENTY = 20;

    public static final String SAVE = "save";
    public static final String IDENTIFICATION = "identification";

    public static final String PAGE_NUM = "pageNum";

    public static final String POST = "POST";
    public static final String PATH_TOP = "application/json;charset=utf-8";

    public static final String REQUEST_URL = "Request URL : {}, Exception :";
    public static final String ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers";


}
