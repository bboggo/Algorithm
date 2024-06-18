def solution(tickets):
    answer = []
    routes = dict() # 티켓 정보를 저장하는 딕셔너리

    for (start, end) in tickets:
        if start in routes:
            routes[start].append(end)
        else:
            routes[start] = [end]
    # 갈 수 있는 공항을 알파벳 역순으로 정렬
    for r in routes.keys():
        routes[r].sort(reverse = True)

    st = ["ICN"]
    while st:
        top = st[-1]
        # 스택 top을 start로 하는 티켓이 없는 경우
        if (top not in routes) or (not routes[top]):
            answer.append(st.pop())   # top을 스택에서 꺼내서 answer에 저장
        # 스택 top을 start로 하는 티켓이 있는 경우
        else:
            st.append(routes[top].pop())

    return answer[::-1]