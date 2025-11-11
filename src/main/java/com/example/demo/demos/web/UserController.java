package com.example.demo.demos.web;

import com.example.demo.model.User;
import com.example.demo.model.ApiResponseBa;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Slf4j
@RestController
@RequestMapping("/api/users")
@Tag(name = "用户管理", description = "用户相关的CRUD操作")
public class UserController {

    private final List<User> users = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    public UserController() {
        // 初始化一些测试数据
        User user1 = new User();
        users.add(user1);
    }

    @Operation(summary = "获取所有用户", description = "返回用户列表")
    @GetMapping
    public ApiResponseBa<List<User>> getAllUsers() {

        return ApiResponseBa.success(users);
    }

    @Operation(summary = "根据ID获取用户", description = "根据用户ID获取用户详情")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "成功获取用户信息"),  // ✅ 正确
            @ApiResponse(responseCode = "404", description = "用户不存在"),      // ✅ 正确
            @ApiResponse(responseCode = "500", description = "服务器内部错误")    // ✅ 正确
    })
    @GetMapping("/{id}")
    public ApiResponseBa<User> getUserById(
            @Parameter(description = "用户ID", example = "1")
            @PathVariable Long id) {


        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .map(ApiResponseBa::success)
                .orElse(ApiResponseBa.error("用户不存在"));
    }

    @Operation(summary = "创建用户", description = "创建新用户")
    @PostMapping
    public ApiResponseBa<User> createUser(@RequestBody User user) {

        user.setId(counter.incrementAndGet());
        users.add(user);
        return ApiResponseBa.success(user);
    }

    @Operation(summary = "更新用户", description = "更新用户信息")
    @PutMapping("/{id}")
    public ApiResponseBa<User> updateUser(
            @Parameter(description = "用户ID") @PathVariable Long id,
            @RequestBody User user) {


        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                user.setId(id);
                users.set(i, user);
                return ApiResponseBa.success(user);
            }
        }
        return ApiResponseBa.error("用户不存在");
    }

    @Operation(summary = "删除用户", description = "根据ID删除用户")
    @DeleteMapping("/{id}")
    public ApiResponseBa<String> deleteUser(
            @Parameter(description = "用户ID") @PathVariable Long id) {


        boolean removed = users.removeIf(user -> user.getId().equals(id));
        if (removed) {
            return ApiResponseBa.success("删除成功");
        } else {
            return ApiResponseBa.error("用户不存在");
        }
    }
}