package cn.raxcl.controller.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cn.raxcl.annotation.VisitLogger;
import cn.raxcl.model.vo.Friend;
import cn.raxcl.model.vo.FriendInfo;
import cn.raxcl.model.vo.Result;
import cn.raxcl.service.FriendService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 友链
 * @author Raxcl
 * @date 2020-09-08
 */
@RestController
public class FriendController {
	@Autowired
	FriendService friendService;

	/**
	 * 获取友链页面
	 *
	 * @return
	 */
	@VisitLogger(behavior = "访问页面", content = "友链")
	@GetMapping("/friends")
	public Result friends() {
		List<Friend> friendList = friendService.getFriendVOList();
		FriendInfo friendInfo = friendService.getFriendInfo(true, true);
		Map<String, Object> map = new HashMap<>();
		map.put("friendList", friendList);
		map.put("friendInfo", friendInfo);
		return Result.ok("获取成功", map);
	}

	/**
	 * 按昵称增加友链浏览次数
	 *
	 * @param nickname 友链昵称
	 * @return
	 */
	@VisitLogger(behavior = "点击友链")
	@PostMapping("/friend")
	public Result addViews(@RequestParam String nickname) {
		friendService.updateViewsByNickname(nickname);
		return Result.ok("请求成功");
	}
}